package com.hosp.utills;

import com.hosp.dto.DoctorDto;
import com.hosp.dto.ScheduleDto;
import com.hosp.dto.SpecialtyDto;
import com.hosp.model.Doctor;
import com.hosp.model.Schedule;
import com.hosp.model.Specialty;
import com.hosp.repository.DoctorRepository;
import com.hosp.repository.ScheduleRepository;
import com.hosp.repository.SpecialtyRepository;
import com.hosp.repository.WeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Daria Popova on 24.03.17.
 */
@Component
public class DtoUtils {

    @Autowired
    private SpecialtyRepository specialtyRepositiry;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private WeekRepository weekRepository;

    public Doctor toEntity(DoctorDto dto) {
        Doctor doctor;
        if (dto.getId() == null) {
            doctor = new Doctor();
            doctor.setId(dto.getId());
        } else {
            doctor = doctorRepository.findOne(dto.getId());
        }
        doctor.setName(dto.getName());
        doctor.setSurname(dto.getSurname());
        if (dto.getSpecialty() != null)
            doctor.setSpecialty(specialtyRepositiry.findOne(dto.getSpecialty()));
        doctor.setPhotoUrl(dto.getPhotoUrl());
        doctor.setMiddleName(dto.getMiddleName());
        return doctor;
    }

    public Schedule toEntity(ScheduleDto dto) {
        Schedule schedule;
        if (dto.getId() == null) {
            schedule = new Schedule();
        } else {
            schedule = scheduleRepository.findOne(dto.getId());
        }
        if (dto.getDoctorId() != null)
            schedule.setDoctor(doctorRepository.findOne(dto.getDoctorId()));
        if (dto.getWeek() != null)
            schedule.setWeek(weekRepository.findOne(dto.getWeek().getId()));
        schedule.setIsFree(dto.getIsFree());
        schedule.setFrom(dto.getFrom());
        schedule.setTo(dto.getTo());
        schedule.setRoomNumber(dto.getRoomNumber());
        return schedule;
    }

    private Specialty toEntity(SpecialtyDto dto) {
        return specialtyRepositiry.findOne(dto.getId());
    }

}
