package com.itis.spring.dto;

import com.itis.spring.model.Specialty;

/**
 * Created by Daria Popova on 24.03.17.
 */

public class SpecialtyDto {

    private Long id;
    private String name;

    public SpecialtyDto() {
    }

    public SpecialtyDto(Specialty specialty) {
        this.id = specialty.getId();
        this.name = specialty.getName();

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
