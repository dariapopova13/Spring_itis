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
    private Long specialty;
    private String photoUrl;
    private List<ScheduleDto> schedules;
    private String middleName;
    private String patronymic;

    public DoctorDto(Doctor doctor) {
        this.id = doctor.getId();
        this.patronymic = doctor.getPatronymic();
        this.name = doctor.getName();
        this.surname = doctor.getSurname();
        this.photoUrl = doctor.getPhotoUrl();
        this.specialty = doctor.getSpecialty() == null ?
                null : doctor.getSpecialty().getId();
        this.schedules = doctor.getSchedules().stream()
                .map(ScheduleDto::new)
                .collect(Collectors.toList());
        this.middleName = doctor.getMiddleName();
    }

    public DoctorDto() {
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Long specialty) {
        this.specialty = specialty;
    }

    public List<ScheduleDto> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleDto> schedules) {
        this.schedules = schedules;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
