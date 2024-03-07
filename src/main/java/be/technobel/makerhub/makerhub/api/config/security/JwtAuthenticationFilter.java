package be.technobel.makerhub.makerhub.api.config.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JWTProvider jwtProvider;

    public JwtAuthenticationFilter(JWTProvider jwtProvider) {
        this.jwtProvider = jwtProvider;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException{

        String token = jwtProvider.extractToken(request);

        if (token!= null && jwtProvider.validateToken(token)){
            Authentication authentication = jwtProvider.createAuthentication(token);

            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request,response);
    }
}
