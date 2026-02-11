package com.kt.MascotasMaravilla.Mapper;

import com.kt.MascotasMaravilla.DTO.CategoriaDTO;
import com.kt.MascotasMaravilla.Models.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    Categoria toEntity(CategoriaDTO categoriaDTO);
    CategoriaDTO toDTO (Categoria categoria);

    List<CategoriaDTO> toList(List<Categoria> categoriaList);

    void updateCategoria(CategoriaDTO categoriaDTO,@MappingTarget Categoria categoria);

}
