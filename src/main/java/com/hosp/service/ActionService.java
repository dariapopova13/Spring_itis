package com.hosp.service;

import com.hosp.dto.DoctorDto;
import com.hosp.dto.SpecialtyDto;

import java.util.List;

/**
 * Created by Daria Popova on 03.04.17.
 */
public interface ActionService {

    List<SpecialtyDto> getSpecialties();

    DoctorDto getDoctor(Long id);



}
