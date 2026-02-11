package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Persona;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Cliente}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO{
    private Integer idCliente;
    private Persona idPersona;
    private Instant fechaRegistro;
}