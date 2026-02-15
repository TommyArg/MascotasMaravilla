package com.kt.MascotasMaravilla.Controller;

import com.kt.MascotasMaravilla.DTO.ClienteDTO;
import com.kt.MascotasMaravilla.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categoria")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody ClienteDTO clienteDTO) {
        clienteService.crear(clienteDTO);
        return ResponseEntity.ok("Cliente creadoo");
    }

    @GetMapping
    public List<ClienteDTO> lista() {
        return clienteService.lista();
    }

    @GetMapping("/list/{Id}")
    public ClienteDTO listaIdCliente(@PathVariable Integer Id) {
        return clienteService.listaId(Id);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<String> actualizar(@PathVariable Integer Id, @RequestBody ClienteDTO clienteDTO) {
        clienteService.editar(Id, clienteDTO);
        return ResponseEntity.ok("Cliente actualizadoo");
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer Id) {
        clienteService.borrar(Id);
        return ResponseEntity.ok("Cliente borradoo");
    }
}
