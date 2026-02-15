package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.VentadetalleDTO;
import com.kt.MascotasMaravilla.Service.VentadetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class VentadetalleController {
    @Autowired
    private VentadetalleService ventadetalleService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody VentadetalleDTO ventadetalleDTO) {
        ventadetalleService.crear(ventadetalleDTO);
        return ResponseEntity.ok("Detalles de venta creadoss");
    }

    @GetMapping
    public List<VentadetalleDTO> lista() {
        return ventadetalleService.lista();
    }

    @GetMapping("/lista/{Id}")
    public VentadetalleDTO lisaIdDTO(@PathVariable Integer Id) {
        return ventadetalleService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody VentadetalleDTO ventadetalleDTO) {
        ventadetalleService.editar(Id, ventadetalleDTO);
        return ResponseEntity.ok("Detalles de venta actualizadoss");
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        ventadetalleService.borrar(Id);
        return ResponseEntity.ok("Detalles de venta eliminadoosss");
    }
}
