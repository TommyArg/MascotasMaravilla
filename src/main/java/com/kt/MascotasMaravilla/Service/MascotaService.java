package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.MascotaDTO;
import com.kt.MascotasMaravilla.Mapper.MascotaMapper;
import com.kt.MascotasMaravilla.Models.Mascota;
import com.kt.MascotasMaravilla.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;
    @Autowired
    private MascotaMapper mascotaMapper;

    public void crear(MascotaDTO mascotaDTO) {
        Mascota mascota = mascotaMapper.toEntity(mascotaDTO);
        mascotaRepository.save(mascota);
    }

    public List<MascotaDTO> lista() {
        List<Mascota> mascotaList = mascotaRepository.findAll();
        return mascotaMapper.toList(mascotaList);
    }

    public MascotaDTO listaId(Integer ID) {
        Mascota mascota = mascotaRepository.findById(ID)
                .orElseThrow(() -> new RuntimeException("Errorrr Mascotaa no encontrada"));
        return mascotaMapper.toDTO(mascota);
    }

    public MascotaDTO editar(Integer ID, MascotaDTO mascotaDTO) {
        Mascota mascota = mascotaRepository.findById(ID)
                .orElseThrow(() -> new RuntimeException("Errorrr snif snif Mascota no encontrada"));
        mascotaMapper.updateMascota(mascotaDTO, mascota);
        Mascota actualizado = mascotaRepository.save(mascota);
        return mascotaMapper.toDTO(actualizado);
    }

    public void borrar(Integer ID) {
        if (!mascotaRepository.existsById(ID)) {
            throw new RuntimeException("Errooor mascota NO borrada ");
        }
        mascotaRepository.deleteById(ID);
    }
}
