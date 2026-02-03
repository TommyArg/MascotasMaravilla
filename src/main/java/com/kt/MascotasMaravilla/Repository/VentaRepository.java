package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Nota: Tendrás que importar tu Modelo manualmente con Alt+Enter
// porque IntelliJ no sabe en qué carpeta exacta están tus Entities.

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
    // Aquí puedes añadir métodos personalizados más tarde
}