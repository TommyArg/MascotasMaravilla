package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.UsuarioDTO;
import com.kt.MascotasMaravilla.Models.Persona;
import com.kt.MascotasMaravilla.Models.Usuario;
import com.kt.MascotasMaravilla.Repository.PersonaRepository;
import com.kt.MascotasMaravilla.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

// NOTA: Recuerda importar tu Modelo y tu Repositorio con Alt+Enter al terminar
@Autowired;
@Service
@RequiredArgsConstructor
public class UsuarioService {
    @Autowired
    private UsuarioRepository UsuarioRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public void crear)(UsuarioDTO usuarioDTO) {
    Usuario usuario = new Usuario();
    Persona persona = personaRepository.findById(UsuarioDTO.getIdPersona())
            .orElseThrow() -> new RuntimeException("Persona no encontrada"));
    }

    usuario.setIdPersona(persona);
    usuario.setUsuario(usuarioDTO.getUsuario());
    usuario.setContrasena(UsuarioDTO.getContrasena());
    usuario.setActivo(usuarioDTO.getActivo());

    usuarioRepository.save(usuario);
}