package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Articulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Ventadetalle}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentadetalleDTO implements Serializable {
    private Integer id;
    private VentaDTO idVenta;
    private Articulo idArticulo;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
}