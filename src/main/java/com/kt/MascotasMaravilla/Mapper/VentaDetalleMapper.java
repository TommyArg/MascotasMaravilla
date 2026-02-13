//asi es con 2 FK también c:
package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.VentadetalleDTO;
import com.kt.MascotasMaravilla.Models.Articulo;
import com.kt.MascotasMaravilla.Models.Venta;
import com.kt.MascotasMaravilla.Models.Ventadetalle;
import com.kt.MascotasMaravilla.Repository.ArticuloRepository;
import com.kt.MascotasMaravilla.Repository.VentaRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class VentaDetalleMapper {
    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ArticuloRepository articuloRepository;

    @Mapping(target = "idVenta", source = "idVenta", qualifiedByName = "idVenta")
    @Mapping(target = "idArticulo", source = "idArticulo", qualifiedByName = "idarticulo")
    public abstract Ventadetalle toEntity(VentadetalleDTO ventadetalleDTO);

    @Mapping(target = "idVenta", source = "idVenta.id", qualifiedByName = "idToVenta")
    public abstract VentadetalleDTO toDTO(Ventadetalle ventadetalle);

    public abstract List<VentadetalleDTO> toList(List<Ventadetalle> ventadetalleList);

    @Mapping(target = "idVenta", source = "idVenta", qualifiedByName = "idVenta")
    public abstract void updateVentadetalle(VentadetalleDTO ventadetalleDTO, @MappingTarget Ventadetalle entity);

    @Named("idToVenta")
    protected Venta idToVenta(Integer idVenta) {
        if (idVenta == null) return null;
        return ventaRepository.findById(idVenta)
                .orElseThrow(() -> new RuntimeException("Errooorrr"));
    }

    @Named("idToArticulo")
    protected Articulo idToArticulo(Integer idArticulo) {
        if (idArticulo == null) return null;
        return articuloRepository.findById(idArticulo)
                .orElseThrow(() -> new RuntimeException("Eeeeeerror"));

    }
}
