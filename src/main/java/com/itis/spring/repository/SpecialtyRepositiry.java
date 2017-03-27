package com.itis.spring.repository;

import com.itis.spring.model.Specialty;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daria Popova on 24.03.17.
 */
@Lazy
@Repository
public interface SpecialtyRepositiry extends JpaRepository<Specialty,Long> {

}
