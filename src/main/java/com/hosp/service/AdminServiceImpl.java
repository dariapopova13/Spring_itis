package com.hosp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hosp.dto.DoctorDto;
import com.hosp.model.Doctor;
import com.hosp.repository.DoctorRepository;
import com.hosp.utills.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private DtoUtils dtoUtils;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public DoctorDto saveDoctor(DoctorDto doctorDto) {
        Doctor doctor = dtoUtils.toEntity(doctorDto);
        doctor = doctorRepository.save(doctor);
        doctor.setSchedules(doctorDto.getSchedules().stream()
                .map(dto -> dtoUtils.toEntity(dto))
                .collect(Collectors.toSet()));
        return new DoctorDto(doctorRepository.save(doctor));
    }

}
