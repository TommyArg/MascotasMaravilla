package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.UsuarioDTO;
import com.kt.MascotasMaravilla.Mapper.UsuarioMapper;
import com.kt.MascotasMaravilla.Models.Usuario;
import com.kt.MascotasMaravilla.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository UsuarioRepository;
    @Autowired
    private UsuarioMapper usuarioMapper;

    public void crear(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        usuarioRepository.save(usuario);
    }

    public List<usuarioDTO> lista(){
        List<Usuario> usuariolist = usuarioRepository.findAll();
        return usuarioMapper.toList(usuariolist);
    }

    public UsuarioDTO listaId (Integer id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Errooor usuario no encontrado guau guau"));
        return usuarioMapper.toDTO(usuario);
    }


    public UsuarioDTO editar(Integer id, UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("User no encontrado grrr"));
        usuarioMapper.updateUsuario(UsuarioDTO, usuario);
        Usuario actualizado = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(actualizado);
    }
    public
}