package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.MascotaDTO;
import com.kt.MascotasMaravilla.Service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody MascotaDTO mascotaDTO) {
        mascotaService.crear(mascotaDTO);
        return ResponseEntity.ok("Mascota creada");
    }

    @GetMapping
    public List<MascotaDTO> lista() {
        return mascotaService.lista();
    }

    @GetMapping("/list/{Id}")
    public MascotaDTO listaIdDTO(@PathVariable Integer Id) {
        return mascotaService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody MascotaDTO mascotaDTO) {
        mascotaService.editar(Id, mascotaDTO);
        return ResponseEntity.ok("Mascotaa actualizada guau guau");
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        mascotaService.borrar(Id);
        return ResponseEntity.ok("Mascota borrada guau grrr");
    }

}
