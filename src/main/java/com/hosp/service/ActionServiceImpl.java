package com.hosp.service;

import com.hosp.dto.DoctorDto;
import com.hosp.dto.SpecialtyDto;
import com.hosp.repository.DoctorRepository;
import com.hosp.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 03.04.17.
 */
@Service
//@Transactional
public class ActionServiceImpl implements ActionService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Override
    public List<SpecialtyDto> getSpecialties() {
        return specialtyRepository.findAll().stream()
                .map(SpecialtyDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDto getDoctor(Long id) {
        return new DoctorDto(doctorRepository.findOne(id));
    }
}
