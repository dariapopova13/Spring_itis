package com.itis.spring.service;

import com.itis.spring.dto.DoctorDto;
import com.itis.spring.model.Doctor;
import com.itis.spring.repository.DoctorRepository;
import com.itis.spring.utills.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 21.03.17.
 */
@Service
public class DoctorService implements AbstractService<Doctor> {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private DtoUtils dtoUtils;

    @Override
    public Doctor findOne(Long id) {
        return doctorRepository.findOne(id);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor saveOrUpdate(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(Long id) {
        doctorRepository.delete(id);
    }

    public List<DoctorDto> getDocs() {
        return doctorRepository.findAll()
                .stream()
                .sorted((o1, o2) -> o1.getId().compareTo(o2.getId()))
                .map(DoctorDto::new)
                .collect(Collectors.toList());
    }

    public DoctorDto getDoctor(Long id){
        return new DoctorDto(doctorRepository.getOne(id));
    }

    public DoctorDto saveOrUpdate(DoctorDto doctorDto) {
        Doctor doctor = dtoUtils.toEntity(doctorDto);
       return new DoctorDto(doctorRepository.save(doctor));
    }
}
