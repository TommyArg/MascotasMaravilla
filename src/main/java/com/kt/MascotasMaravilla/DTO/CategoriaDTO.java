package com.kt.MascotasMaravilla.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Categoria}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO{
    private Integer id;
    private String nombreCategoria;
    private String descripcion;
}