package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.PersonaDTO;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    public void crear(PersonaDTO personaDTO) {
        Persona persona = new Persona() ;
    persona.setNombre(personaDTO.getNombre());
    persona.setDni(personaDTO.getDni());
    persona.setApellido(personaDTO.getApellido());
    persona.setTelefono(personaDTO.getTelefono());
    persona.setEmail(personaDTO.getEmail());
    persona.setApellido(personaDTO.getApellido());
    }
    }

