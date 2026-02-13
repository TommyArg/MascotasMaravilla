package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.StaffDTO;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Models.Staff;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class StaffMapper {
    @Autowired
    private PersonaRepository personaRepository;

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idPersona")
    public abstract Staff toEntity(StaffDTO staffDTO);

    @Mapping(target = "idPersona", source = "idPersona.id")
    public abstract Staff toDTO(Staff staff);

    public abstract List<StaffDTO> toList(List<Staff> staffList);

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idToPersona")
    public abstract void updateStaff(StaffDTO staffDTO, @MappingTarget Staff entity);

    @Named("IdToPersona")
    protected Persona idToPersona(Integer idPersona) {
        if (idPersona == null) return null;
        return personaRepository.findById(idPersona)
                .orElseThrow(() -> new RuntimeException("No se encontró ese empleado :c"));
    }
}
