package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.VentaDTO;
import com.kt.MascotasMaravilla.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @PostMapping
    public ResponseEntity<String> crear(@RequestBody VentaDTO ventaDTO) {
        ventaService.crear(ventaDTO);
        return ResponseEntity.ok("Venta creadaa");
    }

    @GetMapping
    public List<VentaDTO> lista() {return ventaService.lista(); }

    @GetMapping("/list/{Id}")
    public VentaDTO listaIdDTO(@PathVariable Integer Id) {
        return ventaService.listaId(Id);
    }
    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody VentaDTO ventaDTO) {
        ventaService.editar(Id, ventaDTO);
        return ResponseEntity.ok("Venta actualizadaaa");
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        ventaService.borrar(Id);
        return ResponseEntity.ok("Venta borradaaa");
    }
}
