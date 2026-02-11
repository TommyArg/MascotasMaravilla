//so far, so good c:

package com.kt.MascotasMaravilla.Service;
import com.kt.MascotasMaravilla.DTO.StaffDTO;
import com.kt.MascotasMaravilla.Mapper.StaffMapper;
import com.kt.MascotasMaravilla.Models.Staff;
import com.kt.MascotasMaravilla.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StaffMapper staffMapper;

    public void crear(StaffDTO staffDTO){
        Staff staff = staffMapper.toEntity(staffDTO);
        staffRepository.save(staff);
    }

    public void List<StaffDTO> lista() {
        List<Staff> staffList = staffRepository.findAll();
        return staffMapper.toList(staffList);
    }

    public StaffDTO listaId (Integer idStaff) {
        Staff staff = staffRepository.findById(idStaff).orElseThrow (() -> new RuntimeException("Errooor no se encontró ese empleado"));
        return staffMapper.toDTO(staff);
    }
}
