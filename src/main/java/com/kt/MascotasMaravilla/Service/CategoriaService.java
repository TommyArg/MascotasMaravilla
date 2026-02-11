package com.kt.MascotasMaravilla.Service;
import com.kt.MascotasMaravilla.DTO.CategoriaDTO;
import com.kt.MascotasMaravilla.Mapper.CategoriaMapper;
import com.kt.MascotasMaravilla.Models.Categoria;
import com.kt.MascotasMaravilla.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaMapper categoriaMapper;

    public void crear(CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoriaRepository.save(categoria);
    }

    public List<CategoriaDTO> lista() {
        List<Categoria> categoriaList = categoriaRepository.findAll();
        return categoriaMapper.toList(categoriaList);
    }

    public CategoriaDTO listaID (Integer ID) {
        Categoria categoria  = categoriaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        return categoriaMapper.toDTO(categoria);
    }

    public CategoriaDTO editar (Integer ID, CategoriaDTO categoriaDTO) {
        Categoria categoria  = categoriaRepository.findById(ID).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
        categoriaMapper.updateCategoria(categoriaDTO, categoria);
        Categoria actualizado = categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(actualizado);
    }
    public void borrar(Integer ID) {
        if (!categoriaRepository.existsById(ID)) {
            throw new RuntimeException("Nu.");
        }
        categoriaRepository.deleteById(ID);}
}
