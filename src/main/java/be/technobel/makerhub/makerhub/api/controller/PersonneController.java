package be.technobel.makerhub.makerhub.api.controller;


import be.technobel.makerhub.makerhub.api.models.dto.PersonneDto;
import be.technobel.makerhub.makerhub.api.models.forms.PersonneForm;
import be.technobel.makerhub.makerhub.bll.PersonneService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/makerhub")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED) // Permet de renvoyer une 201 et pas une 200 si tout va bien.
    public void create(@RequestBody PersonneForm form){
        personneService.create(form);
    }

    @GetMapping("/{id:[0-9]+}")
    public ResponseEntity<PersonneDto> getOne(@PathVariable Long id){
        return ResponseEntity.ok(PersonneDto.fromEntity(personneService.getOne(id).orElseThrow(()-> new EntityNotFoundException("Pas trouvé"))));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonneDto>> getAll(){
        return ResponseEntity.ok(personneService.getAll().stream().map(PersonneDto::fromEntity).toList()); // Ceci est une référence de méthode
    }
    //TODO j'en suis à 26' de la 3eme vidéo
}
