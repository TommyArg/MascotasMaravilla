package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.ClienteDTO;
import com.kt.MascotasMaravilla.DTO.VentaDTO;
import com.kt.MascotasMaravilla.Models.Cliente;
import com.kt.MascotasMaravilla.Models.Venta;
import com.kt.MascotasMaravilla.Repository.ClienteRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Mapper(componentModel ="spring")
public abstract class VentaMapper {
    @Autowired
    private ClienteRepository clienteRepository;

    @Mapping(target = "idCliente", source = "idCliente", qualifiedByName = "idToCliente")
    public abstract Venta toEntity(VentaDTO ventaDTO);

    @Mapping(target ="idCliente", source = "idCliente.id")
    public abstract VentaDTO toDTO (Venta venta);

    @Mapping(target = "idCliente", source = "idCliente", qualifiedByName = "idToCliente")
    public abstract void updateVenta (VentaDTO ventaDTO, @MappingTarget Venta entity);

    public abstract List<VentaDTO> toList (List<Venta> ventaList);

    @Named("idToCliente")
    protected Cliente idToCliente(Integer idCliente){
    if(idCliente == null) return null;
    return clienteRepository.findById(idCliente)
            .orElseThrow(() -> new RuntimeException("Otro error igual :b bueno cliente no encontrado para la venta"));
    }
}
