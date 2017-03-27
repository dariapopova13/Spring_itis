package com.itis.spring.utills;

import com.itis.spring.dto.DoctorDto;
import com.itis.spring.dto.SpecialtyDto;
import com.itis.spring.model.Doctor;
import com.itis.spring.model.Specialty;
import com.itis.spring.repository.SpecialtyRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Daria Popova on 24.03.17.
 */
@Component
public class DtoUtils {

    @Autowired
    private SpecialtyRepositiry specialtyRepositiry;

    public Doctor toEntity(DoctorDto dto) {
        Doctor doctor = new Doctor();
        if (dto.getId() != null) {
            doctor.setId(dto.getId());
        }
        doctor.setName(dto.getName());
        doctor.setSurname(dto.getSurname());
        doctor.setSpecialty(toEntity(dto.getSpecialtyDto()));

        return doctor;
    }

    private Specialty toEntity(SpecialtyDto dto) {
        return specialtyRepositiry.findOne(dto.getId());
    }

}
