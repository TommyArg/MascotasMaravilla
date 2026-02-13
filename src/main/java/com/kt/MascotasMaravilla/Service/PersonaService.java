package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.PersonaDTO;
import com.kt.MascotasMaravilla.Mapper.PersonaMapper;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PersonaMapper personaMapper;

    public void crear(PersonaDTO personaDTO) {
        Persona persona = personaMapper.toEntity(personaDTO);
        personaRepository.save(persona);
    }

    public List<PersonaDTO> lista() {
        List<Persona> personaList = personaRepository.findAll();
        return personaMapper.toList(personaList);
    }

    public PersonaDTO listaID(Integer ID) {
        Persona persona = personaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Persona no encontrada"));
        return personaMapper.toDTO(persona);
    }

    public PersonaDTO editar(Integer ID, PersonaDTO personaDTO) {
        Persona persona = personaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Persona no encontrada"));
        personaMapper.updatePersona(personaDTO, persona);
        Persona actualizado = personaRepository.save(persona);
        return personaMapper.toDTO(actualizado);
    }

    public void borrar(Integer ID) {
        if (!personaRepository.existsById(ID)) {
            throw new RuntimeException("Nu.");

        }
        personaRepository.deleteById(ID);
    }
}



