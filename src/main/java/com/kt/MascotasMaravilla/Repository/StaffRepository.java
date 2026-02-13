package com.kt.MascotasMaravilla.Repository;

import com.kt.MascotasMaravilla.Models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}