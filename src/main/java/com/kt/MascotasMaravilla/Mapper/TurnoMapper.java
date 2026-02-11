//Así es cuando hay 2 FK c:

package com.kt.MascotasMaravilla.Mapper;
import com.kt.MascotasMaravilla.DTO.TurnoDTO;
import com.kt.MascotasMaravilla.Models.Mascota;
import com.kt.MascotasMaravilla.Models.Staff;
import com.kt.MascotasMaravilla.Models.Turno;
import com.kt.MascotasMaravilla.Repository.MascotaRepository;
import com.kt.MascotasMaravilla.Repository.StaffRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Mapper(componentModel = "spring")
public abstract class TurnoMapper {
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private MascotaRepository mascotaRepository;

    @Mapping(target = "idStaff", source = "idStaff", qualifiedByName = "idStaff")
    @Mapping(target ="idMascota", source = "idMascota", qualifiedByName = "idMascota")
    public abstract Turno toEntity(TurnoDTO turnoDTO);

    @Mapping(target = "idStaff", source = "idStaff.id")
    public abstract TurnoDTO toDTO (Turno turno);

    public abstract List<TurnoDTO> toList (List<Turno> turnoList);

    @Mapping(target = "idStaff", source ="idStaff", qualifiedByName = "idToStaff")
    public abstract void updateTurno(TurnoDTO turnoDTO, @MappingTarget Turno entity);


    @Named("idToStaff")
    protected Staff idToStaff(Integer idStaff){
        if(idStaff == null) return null;
        return staffRepository.findById(idStaff)
                .orElseThrow(() -> new RuntimeException("Error"));
    }
    @Named("idToMascota")
    protected Mascota idToMascota(Integer idMascota){
        if(idMascota == null) return null;
        return mascotaRepository.findById(idMascota)
                .orElseThrow(() -> new RuntimeException("Error"));
    }

}
