package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.UsuarioDTO;
import com.kt.MascotasMaravilla.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.crear(usuarioDTO);
        return ResponseEntity.ok("Usuario creadoo");
    }

    @GetMapping
    public List<UsuarioDTO> lista() {
        return usuarioService.lista();
    }

    @GetMapping("/list/{Id}")
    public UsuarioDTO listaIdDTO(@PathVariable Integer Id) {
        return usuarioService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.editar(Id, usuarioDTO);
        return ResponseEntity.ok("Usuario actualizado");
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        usuarioService.borrar(Id);
        return ResponseEntity.ok("Usuario eliminado");
    }
}
