package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}