package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.Specialty;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 31.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecialtyDto {

    private Long id;
    private List<DoctorDto> doctors;
    private String name;

    public SpecialtyDto(Specialty specialty) {
        this.id = specialty.getId();
        this.name = specialty.getName();
        this.doctors = specialty.getDoctors().stream()
                .map(DoctorDto::new)
                .collect(Collectors.toList());
    }

    public List<DoctorDto> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<DoctorDto> doctors) {
        this.doctors = doctors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
