package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.CategoriaDTO;
import com.kt.MascotasMaravilla.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.crear(categoriaDTO);
        return ResponseEntity.ok("Categoria creada guau guauu");
    }

    @GetMapping
    public List<CategoriaDTO> lista() {
        return categoriaService.lista();
    }

    @PutMapping("/list/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.editar(Id, categoriaDTO);
        return ResponseEntity.ok("Categoria creaada");
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        categoriaService.borrar(Id);
        return ResponseEntity.ok("Categoria borraada");
    }
}

