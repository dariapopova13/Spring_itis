package com.itis.spring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.itis.spring.model.Doctor;

/**
 * Created by Daria Popova on 24.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoctorDto {

    private Long id;
    private String name;
    private String surname;
    private SpecialtyDto specialtyDto;

    public DoctorDto() {
    }

    public DoctorDto(Doctor doctor) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.surname = doctor.getSurname();
        this.specialtyDto = doctor.getSpecialty() == null ? null : new SpecialtyDto(doctor.getSpecialty());
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public SpecialtyDto getSpecialtyDto() {
        return specialtyDto;
    }

    public void setSpecialtyDto(SpecialtyDto specialtyDto) {
        this.specialtyDto = specialtyDto;
    }
}
