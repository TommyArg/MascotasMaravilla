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
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository UsuarioRepository;

}