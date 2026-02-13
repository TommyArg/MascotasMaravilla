package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Ventadetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentadetalleRepository extends JpaRepository<Ventadetalle, Integer> {

}