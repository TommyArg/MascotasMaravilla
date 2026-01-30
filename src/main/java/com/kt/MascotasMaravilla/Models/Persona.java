package com.kt.MascotasMaravilla.Models;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.query.JpqlQueryBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_persona;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate creado;
    private LocalDate editado;

}
