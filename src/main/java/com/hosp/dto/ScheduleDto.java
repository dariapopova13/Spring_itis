package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.Schedule;

import java.util.Date;

/**
 * Created by Daria Popova on 31.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleDto {

    private Long id;
    private String roomNumber;
    private Integer isFree;
    private WeekDto week;
    private String from;
    private String to;
    private Long doctorId;

    public ScheduleDto(Schedule schedule) {
        this.doctorId = schedule.getDoctor() == null ?
                null : schedule.getDoctor().getId();

        this.id = schedule.getId();
        this.roomNumber = schedule.getRoomNumber();
        this.isFree = schedule.getIsFree();
        this.week = schedule.getWeek() == null ? null : new WeekDto(schedule.getWeek());
        this.from = schedule.getFrom();
        this.to = schedule.getTo();
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public WeekDto getWeek() {
        return week;
    }

    public void setWeek(WeekDto week) {
        this.week = week;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
