package com.hosp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hosp.model.Week;

/**
 * Created by Daria Popova on 31.03.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeekDto {

    private Long id;
    private String name;

    public WeekDto(Week week) {
        this.id = week.getId();
        this.name = week.getName();
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
