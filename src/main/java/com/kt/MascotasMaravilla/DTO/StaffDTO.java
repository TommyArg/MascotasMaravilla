package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link Staff}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO{
    private Integer id;
    private Integer idPersona;
    private String rol;
    private String matricula;
    private Instant creado;
    private Instant editado;
}