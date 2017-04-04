package com.hosp.model;

import com.hosp.model.common.AbstractEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "week")
@DynamicInsert
@DynamicUpdate
public class Week extends AbstractEntity {

    @Column(name = "name", unique = true)
    private String name;

    public Week() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
