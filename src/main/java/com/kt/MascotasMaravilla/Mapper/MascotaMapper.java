package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.MascotaDTO;
import com.kt.MascotasMaravilla.Models.Cliente;
import com.kt.MascotasMaravilla.Models.Mascota;
import com.kt.MascotasMaravilla.Repository.ClienteRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class MascotaMapper {
    @Autowired
    private ClienteRepository clienteRepository;

    @Mapping(target = "idCliente", source = "idCliente", qualifiedByName = "idCliente")
    public abstract Mascota toEntity(MascotaDTO mascotaDTO);

    @Mapping(target = "idCliente", source = "idCliente.id")
    public abstract MascotaDTO toDTO(Mascota mascota);

    public abstract List<MascotaDTO> toList(List<Mascota> mascotaList);

    @Mapping(target = "idCliente", source = "idCliente", qualifiedByName = "idToCliente")
    public abstract void updateMascota(MascotaDTO mascotaDTO, @MappingTarget Mascota entity);

    @Named("idToCliente")
    protected Cliente idToCliente(Integer idCliente) {
        if (idCliente == null) return null;
        return clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Error, no se encontró al dueño de esta mascotita :c"));
    }
}
