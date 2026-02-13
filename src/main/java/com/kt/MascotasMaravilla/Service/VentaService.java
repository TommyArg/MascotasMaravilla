package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.VentaDTO;
import com.kt.MascotasMaravilla.Mapper.VentaMapper;
import com.kt.MascotasMaravilla.Models.Venta;
import com.kt.MascotasMaravilla.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Autowired
    private VentaMapper ventaMapper;

    public void crear(VentaDTO ventaDTO) {
        Venta venta = ventaMapper.toEntity(ventaDTO);
        ventaRepository.save(venta);
    }

    public List<VentaDTO> lista() {
        List<Venta> ventaList = ventaRepository.findAll();
        return ventaMapper.toList(ventaList);
    }

    public VentaDTO listaID(Integer ID) {
        Venta venta = ventaRepository.findById(ID).orElseThrow(() -> new RuntimeException("ErroOoor no encontré ventass"));
        return ventaMapper.toDTO(venta);
    }

    public VentaDTO editar(Integer ID, VentaDTO ventaDTO) {
        Venta venta = ventaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Error no encontre ventass"));
        ventaMapper.updateVenta(ventaDTO, venta);
        Venta actualizado = ventaRepository.save(venta);
        return ventaMapper.toDTO(actualizado);
    }

    public void borrar(Integer ID) {
        if (!ventaRepository.existsById(ID)) {
            throw new RuntimeException("Errorrr no lo quise robar");
        }
        ventaRepository.deleteById(ID);
    }
}
