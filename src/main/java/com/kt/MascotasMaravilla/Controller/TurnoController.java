package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.TurnoDTO;
import com.kt.MascotasMaravilla.Service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/turno")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody TurnoDTO turnoDTO) {
        turnoService.crear(turnoDTO);
        return ResponseEntity.ok("turno creadoo");
    }

    @GetMapping
    public List<TurnoDTO> lista() {
        return turnoService.lista();
    }

    @GetMapping("/list/{Id}")
    public TurnoDTO listaIdDTO(@PathVariable Integer Id) {
        return turnoService.listaId(Id);
    }

    @GetMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody TurnoDTO turnoDTO) {
        turnoService.editar(Id, turnoDTO);
        return ResponseEntity.ok("Turno actualizadoo");
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        turnoService.borrar(Id);
        return ResponseEntity.ok("Turno borrado");
    }

}
