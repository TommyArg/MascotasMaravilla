package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
}