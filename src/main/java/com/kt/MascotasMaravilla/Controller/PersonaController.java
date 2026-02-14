package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.PersonaDTO;
import com.kt.MascotasMaravilla.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody PersonaDTO personaDTO) {
        personaService.crear(personaDTO);
        return ResponseEntity.ok("persona creada");
    }

    @GetMapping
    public List<PersonaDTO> lista() {
        return personaService.lista();
    }

    @GetMapping("/list/{Id}")
    public PersonaDTO listaIdDTO(@PathVariable Integer Id) {
        return personaService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody PersonaDTO personaDTO) {
        personaService.editar(Id, personaDTO);
        return ResponseEntity.ok("Persona actualizada guau guau");
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        personaService.borrar(Id);
        return ResponseEntity.ok("Persona eliminada guau guau");
    }
}

