package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Venta}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaDTO {
    private Integer id;
    private Cliente idCliente;
    private Instant fechaVenta;
    private BigDecimal total;
}