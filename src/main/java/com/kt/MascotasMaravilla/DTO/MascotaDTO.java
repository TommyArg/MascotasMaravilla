package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Mascota}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MascotaDTO{
    private Integer id;
    private Cliente idCliente;
    private String nombre;
    private String especie;
    private String raza;
    private LocalDate fechaNacimiento;
}