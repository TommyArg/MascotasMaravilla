package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.VentadetalleDTO;
import com.kt.MascotasMaravilla.Mapper.VentaDetalleMapper;
import com.kt.MascotasMaravilla.Models.Ventadetalle;
import com.kt.MascotasMaravilla.Repository.VentadetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VentadetalleService {
    @Autowired
    private VentadetalleRepository ventadetalleRepository;

    @Autowired
    private VentaDetalleMapper ventaDetalleMapper;

    public void crear(VentadetalleDTO ventadetalleDTO) {
        Ventadetalle ventadetalle = ventaDetalleMapper.toEntity(ventadetalleDTO);
        ventadetalleRepository.save(ventadetalle);
    }

    // --- > idVentaDetalle <---
    public List<VentadetalleDTO> lista() {
        List<Ventadetalle> ventadetalleList = ventadetalleRepository.findAll();
        return ventaDetalleMapper.toList(ventadetalleList);
    }

    public VentadetalleDTO listaId(Integer idVentaDetalle) {
        Ventadetalle ventadetalle = ventadetalleRepository.findById(idVentaDetalle).orElseThrow(() -> new RuntimeException("Error guau guau no se encontró ID detashes"));
        return ventaDetalleMapper.toDTO(ventadetalle);
    }

    public VentadetalleDTO editar(Integer idVentaDetalle, VentadetalleDTO ventadetalleDTO) {
        Ventadetalle ventadetalle = ventadetalleRepository.findById(idVentaDetalle).orElseThrow(() -> new RuntimeException("Eeerrorrr no se encontró esa ID de detashes"));
        ventaDetalleMapper.updateVentadetalle(ventadetalleDTO, ventadetalle);
        Ventadetalle actualizado = ventadetalleRepository.save(ventadetalle);
        return ventaDetalleMapper.toDTO(actualizado);
    }

    public void borrar(Integer idVentaDetalle) {
        if (!ventadetalleRepository.existsById(idVentaDetalle)) {
            throw new RuntimeException("noooONONOHGNRNRNGHR.");
        }
        ventadetalleRepository.deleteById(idVentaDetalle);
    }
}
