package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.Role;

/**
 * Created by Daria Popova on 02.04.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {

    private String name;

    public RoleDto(Role role) {
        this.name = role.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
