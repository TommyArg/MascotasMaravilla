package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.StaffDTO;
import com.kt.MascotasMaravilla.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody StaffDTO staffDTO) {
        staffService.crear(staffDTO);
        return ResponseEntity.ok("Staff creadoo");
    }

    @GetMapping
    public List<StaffDTO> lista() {
        return staffService.lista();
    }

    @GetMapping("/list{Id}")
    public StaffDTO listaIdDTO(@PathVariable Integer Id) {
        return staffService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody StaffDTO staffDTO) {
        staffService.editar(Id, staffDTO);
        return ResponseEntity.ok("Staff actualizado");
    }

    @DeleteMapping
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        staffService.borrar(Id);
        return ResponseEntity.ok("Staff borrado");
    }
}
