package com.itis.spring.repository;

import com.itis.spring.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Daria Popova on 21.03.17.
 */
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {


}
