package com.kt.MascotasMaravilla.Service;

import com.kt.MascotasMaravilla.DTO.TurnoDTO;
import com.kt.MascotasMaravilla.Mapper.TurnoMapper;
import com.kt.MascotasMaravilla.Models.Turno;
import com.kt.MascotasMaravilla.Repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;
    @Autowired
    private TurnoMapper turnoMapper;

    public void crear(TurnoDTO turnoDTO) {
        Turno turno = turnoMapper.toEntity(turnoDTO);
        turnoRepository.save(turno);
    }

    public List<TurnoDTO> lista() {
        List<Turno> turnoList = turnoRepository.findAll();
        return turnoMapper.toList(turnoList);
    }

    public TurnoDTO listaId(Integer Id) {
        Turno turno = turnoRepository.findById(Id).orElseThrow(() -> new RuntimeException("Errorr Turno no encontrado guau guau"));
        return turnoMapper.toDTO(turno);
    }

    public TurnoDTO editar(Integer Id, TurnoDTO turnoDTO) {
        Turno turno = turnoRepository.findById(Id).orElseThrow(() -> new RuntimeException("Error No encontréee el turno guau guau"));
        turnoMapper.updateTurno(turnoDTO, turno);
        Turno actualizado = turnoRepository.save(turno);
        return turnoMapper.toDTO(actualizado);
    }

    public void borrar(Integer ID) {
        if (!turnoRepository.existsById(ID)) {
            throw new RuntimeException("Errror No encontré para borrarr");
        }
        turnoRepository.deleteById(ID);
    }
}
