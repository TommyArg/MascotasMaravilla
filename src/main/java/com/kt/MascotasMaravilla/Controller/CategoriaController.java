package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.CategoriaDTO;
import com.kt.MascotasMaravilla.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

