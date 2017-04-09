package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.Doctor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 24.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoctorDto {

    private Long id;
    private String name;
    private String surname;
    private String specialty;
    private String photoUrl;
    private List<ScheduleDto> scheduleDto;

    public DoctorDto(Doctor doctor) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.surname = doctor.getSurname();
        this.photoUrl = doctor.getPhotoUrl();
        this.specialty = doctor.getSpecialty() == null ?
                null : doctor.getSpecialty().getName();
        this.scheduleDto = doctor.getSchedules().stream()
                .map(ScheduleDto::new)
                .collect(Collectors.toList());
    }

    public List<ScheduleDto> getScheduleDto() {
        return scheduleDto;
    }

    public void setScheduleDto(List<ScheduleDto> scheduleDto) {
        this.scheduleDto = scheduleDto;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
