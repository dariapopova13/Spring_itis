package com.hosp.utills;

import com.hosp.dto.DoctorDto;
import com.hosp.dto.SpecialtyDto;
import com.hosp.model.Doctor;
import com.hosp.model.Specialty;
import com.hosp.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Daria Popova on 24.03.17.
 */
@Component
public class DtoUtils {

    @Autowired
    private SpecialtyRepository specialtyRepositiry;

    public Doctor toEntity(DoctorDto dto) {
        Doctor doctor = new Doctor();
        if (dto.getId() != null) {
            doctor.setId(dto.getId());
        }
        doctor.setName(dto.getName());
        doctor.setSurname(dto.getSurname());


        return doctor;
    }

    private Specialty toEntity(SpecialtyDto dto) {
        return specialtyRepositiry.findOne(dto.getId());
    }

}
