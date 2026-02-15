package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.ArticuloDTO;
import com.kt.MascotasMaravilla.Service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody ArticuloDTO articuloDTO) {
        articuloService.crear(articuloDTO);
        return ResponseEntity.ok("Articulo creado guau guau");
    }

    @GetMapping
    public List<ArticuloDTO> lista() {
        return articuloService.lista();
    }

    @GetMapping("/list/{Id}")
    public ArticuloDTO listaIdDTO(@PathVariable Integer Id) {
        return articuloService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody ArticuloDTO articuloDTO) {
        articuloService.editar(Id, articuloDTO);
        return ResponseEntity.ok("Articulo actualizadooo");
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        articuloService.borrar(Id);
        return ResponseEntity.ok("Articulo eliminadoo");
    }
}
