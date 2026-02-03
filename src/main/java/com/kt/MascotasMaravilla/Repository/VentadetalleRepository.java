package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Ventadetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Nota: Tendrás que importar tu Modelo manualmente con Alt+Enter
// porque IntelliJ no sabe en qué carpeta exacta están tus Entities.

@Repository
public interface VentadetalleRepository extends JpaRepository<Ventadetalle, Integer> {
    // Aquí puedes añadir métodos personalizados más tarde
}