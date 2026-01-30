package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository <Persona, Integer>{

}
