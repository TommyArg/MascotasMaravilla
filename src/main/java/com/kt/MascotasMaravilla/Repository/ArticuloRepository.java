package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

}