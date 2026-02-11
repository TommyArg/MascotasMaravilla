package com.kt.MascotasMaravilla.Mapper;
import com.kt.MascotasMaravilla.DTO.UsuarioDTO;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Models.Usuario;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {
    @Autowired
    private PersonaRepository personaRepository;

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idToPersona")
    public abstract Usuario toEntity(UsuarioDTO usuarioDTO);

    @Mapping(target = "idPersona", source = "idPersona")
    public abstract UsuarioDTO toDTO (Usuario usuario);

    public abstract List<UsuarioDTO> toList(List<Usuario> usuarioList);

    @Mapping(target = "idPersona", source = "idPersona", qualifiedByName = "idToPersona")
    public abstract void pdateUsuario(UsuarioDTO usuarioDTO,@MappingTarget Usuario entity);


    @Named("idToPersona")
    protected Persona idToPersona(Integer idPersona){
    if(idPersona == null) return null;
    return personaRepository.findById(idPersona)
            .orElseThrow(() -> new RuntimeException("Error"));
}
}
