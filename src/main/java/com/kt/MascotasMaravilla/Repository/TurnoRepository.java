package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {
    List<Turno> id(Integer id);

}