package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.ArticuloDTO;
import com.kt.MascotasMaravilla.DTO.CategoriaDTO;
import com.kt.MascotasMaravilla.Models.Articulo;
import com.kt.MascotasMaravilla.Models.Categoria;
import com.kt.MascotasMaravilla.Repository.CategoriaRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ArticuloMapper {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Mapping(target = "idCategoria", source = "idCategoria", qualifiedByName = "idCategoria")
    public abstract Articulo toEntity(ArticuloDTO articuloDTO);


    @Mapping(target = "idCategoria", source = "idCategoria.id")
    public abstract ArticuloDTO toDTO(Articulo articulo);

    public abstract List<ArticuloDTO> toList(List<Articulo> articuloList);

    @Mapping(target = "idCategoria", source = "idCategoria", qualifiedByName = "idToCategoria")
    public abstract void updateArticulo(ArticuloDTO articuloDTO, @MappingTarget Articulo entity);

    @Named("IdToCategoria")
    protected Categoria idToCategoria(Integer idCategoria) {
        if (idCategoria == null) return null;
        return categoriaRepository.findById(idCategoria)
                .orElseThrow(() -> new RuntimeException("Eeerroooor categoria ID ñam ñam :b"));
    }
}
