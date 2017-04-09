package com.hosp.service;

import com.hosp.dto.DoctorDto;
import com.hosp.model.Doctor;
import com.hosp.repository.DoctorRepository;
import com.hosp.utills.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private DtoUtils dtoUtils;

    @Override
    public DoctorDto saveDoctor(DoctorDto doctorDto) {
        Doctor doctor = dtoUtils.toEntity(doctorDto);
        return new DoctorDto(doctorRepository.save(doctor));
    }
}
