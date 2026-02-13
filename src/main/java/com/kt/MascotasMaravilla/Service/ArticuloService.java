package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.ArticuloDTO;
import com.kt.MascotasMaravilla.Mapper.ArticuloMapper;
import com.kt.MascotasMaravilla.Models.Articulo;
import com.kt.MascotasMaravilla.Repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.RuntimeErrorException;
import java.util.List;

public class ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;
    @Autowired
    private ArticuloMapper articuloMapper;

    public void crear(ArticuloDTO articuloDTO) {
        Articulo articulo = articuloMapper.toEntity(articuloDTO);
        articuloRepository.save(articulo);
    }

    public List<ArticuloDTO> lista(Integer ID) {
        List<Articulo> articuloList = articuloRepository.findAll();
        return articuloMapper.toList(articuloList);
    }

    public ArticuloDTO listaID(Integer ID) {
        Articulo articulo = articuloRepository.findById(ID).orElseThrow(() -> new RuntimeException("No encontrée articuloss"));
        return articuloMapper.toDTO(articulo);
    }

    public ArticuloDTO editar(Integer ID, ArticuloDTO articuloDTO) {
        Articulo articulo = articuloRepository.findById(ID).orElseThrow(() -> new RuntimeException("Snif snif articulo no encontrado grr"));
        articuloMapper.updateArticulo(articuloDTO, articulo);
        Articulo actualizado = articuloRepository.save(articulo);
        return articuloMapper.toDTO(actualizado);

    }

    public void borrar(Integer ID) {
        if (!articuloRepository.existsById(ID)) {
            throw new RuntimeException("Errorr. No quiero borrar.");
        }
        articuloRepository.deleteById(ID);
    }
}
