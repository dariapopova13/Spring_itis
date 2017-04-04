package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 02.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersDto {

    private Long id;
    private List<ScheduleDto> schedules;
    private String username;
    private String password;
    private Boolean enabled;
    private String name;
    private String surname;
    private List<RoleDto> roles;

    public UsersDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.enabled = user.getEnabled();
        this.name = user.getName();
        this.surname = user.getSurname();
//        this.schedules = user.getSchedules().stream()
//                .map(ScheduleDto::new)
//                .collect(Collectors.toList());
//        this.roles = user.getRoles().stream()
//                .map(RoleDto::new)
//                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ScheduleDto> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleDto> schedules) {
        this.schedules = schedules;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }
}
