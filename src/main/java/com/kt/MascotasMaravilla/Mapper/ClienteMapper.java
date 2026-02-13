package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.ClienteDTO;
import com.kt.MascotasMaravilla.Models.Cliente;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ClienteMapper {
    @Autowired
    private PersonaRepository personaRepository;

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idPersona")
    public abstract Cliente toEntity(ClienteDTO clienteDTO);

    @Mapping(target = "idPersona", source = "idPersona.id")
    public abstract ClienteDTO toDTO(Cliente cliente);

    public abstract List<ClienteDTO> toList(List<Cliente> clienteList);

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idToPersona")
    public abstract void updateCliente(ClienteDTO clienteDTO, @MappingTarget Cliente entity);

    @Named("idToPersona")
    protected Persona idToPersona(Integer idPersona) {
        if (idPersona == null) return null;
        return personaRepository.findById(idPersona)
                .orElseThrow(() -> new RuntimeException("Erruuur no encontré ese ID de pershona unu"));

    }
}
