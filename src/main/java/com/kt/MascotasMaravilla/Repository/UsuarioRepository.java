package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}