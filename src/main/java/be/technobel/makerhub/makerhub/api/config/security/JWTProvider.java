package be.technobel.makerhub.makerhub.api.config.security;

import be.technobel.makerhub.makerhub.dal.Enum.UserRole;
import be.technobel.makerhub.makerhub.dal.entities.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
public class JWTProvider {

    private static final String JWT_SECRET = "zqNx2Rx4a837H54Rm3L54cR43qi95N8Wwc5H2XdtBGr45W6U9t2yPZVzzwHeLEXs";

    //Delai de validité
    private static final long EXPIRES_AT = 900; // 15 minutes.
    // Nom en tête
    private static final String AUTH_HEADER = "Authorization";
    //Type
    private static final String TOKEN_PREFIX = "Bearer ";

    private final UserDetailsService userDetailsService;

    public JWTProvider(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String generateToken(String username, List<UserRole> roles){
        return TOKEN_PREFIX + JWT.create()
                .withSubject(username)
                .withClaim("roles",roles.stream().map(Enum::toString).toList())
                .withExpiresAt(Instant.now().plusMillis(EXPIRES_AT))
                .sign(Algorithm.HMAC512(JWT_SECRET));
    }

    public String extractToken(HttpServletRequest request){
        String header = request.getHeader(AUTH_HEADER);

        if(header == null || !header.startsWith(TOKEN_PREFIX))
            return null;

        return header.replaceFirst(TOKEN_PREFIX,"");
    }

    public boolean validateToken(String token){

        try {

            DecodedJWT jwt = JWT.require(Algorithm.HMAC512(JWT_SECRET))
                    .acceptExpiresAt(EXPIRES_AT)
                    .withClaimPresence("sub")
                    .withClaimPresence("roles")
                    .build()
                    .verify(token);

            String username = jwt.getSubject();
            User user = (User) userDetailsService.loadUserByUsername(username);
            if (!user.isEnabled())
                return false;


            List<UserRole> tokenRoles = jwt.getClaim("roles").asList(UserRole.class);


            return user.getRoles().containsAll(tokenRoles);


        }catch (JWTVerificationException | UsernameNotFoundException ex) {
            return false;
        }
    }

    public Authentication createAuthentication(String token){
        DecodedJWT jwt = JWT.decode(token);

        String username = jwt.getSubject();

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        return new UsernamePasswordAuthenticationToken(
                userDetails.getUsername(),
                null,
                userDetails.getAuthorities()
        );
    }


}
