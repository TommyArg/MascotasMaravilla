package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Persona;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
    public class UsuarioDTO {
        private Integer id;
        private Integer idPersona;
        private String usuario;
      //  private String contrasena;
        private Boolean activo;
    }
