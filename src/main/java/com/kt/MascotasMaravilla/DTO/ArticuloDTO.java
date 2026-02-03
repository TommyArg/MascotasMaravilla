package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Articulo}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloDTO {
    private Integer id;
    private Categoria idCategoria;
    private String nombreArticulo;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
}