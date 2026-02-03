package com.kt.MascotasMaravilla.DTO;

import com.kt.MascotasMaravilla.Models.Mascota;
import com.kt.MascotasMaravilla.Models.Staff;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.kt.MascotasMaravilla.Models.Turno}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {
    private Integer id;
    private Mascota idMascota;
    private Staff idStaff;
    private Instant fechaHora;
    private String motivo;
    private String estado;
}