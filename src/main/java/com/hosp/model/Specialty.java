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
    @OneToMany(mappedBy = "specialty", fetch = FetchType.LAZY)
    private Set<Doctor> doctors = new HashSet<>();

    public Specialty() {
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
