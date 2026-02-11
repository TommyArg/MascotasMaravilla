package com.kt.MascotasMaravilla.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {
    private Integer idPersona;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Instant creado;
    private Instant editado;
}
