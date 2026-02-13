package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

}