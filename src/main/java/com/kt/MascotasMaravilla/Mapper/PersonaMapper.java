package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.PersonaDTO;
import com.kt.MascotasMaravilla.Models.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;
@Mapper(componentModel = "spring")
public interface PersonaMapper {
    Persona toEntity(PersonaDTO personaDTO);
    PersonaDTO toDTO (Persona persona);

    List<PersonaDTO> toList(List<Persona> personaList);

    void updatePersona(PersonaDTO personaDTO,@MappingTarget Persona persona);

}
