package com.hosp.model;

import com.hosp.model.common.AbstractEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "specialty")
@DynamicInsert
@DynamicUpdate
public class Specialty extends AbstractEntity {

    @Column(name = "name")
    private String name;

    public Specialty() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
