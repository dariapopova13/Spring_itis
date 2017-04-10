package com.hosp.repository;

import com.hosp.model.Week;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Repository
public interface WeekRepository extends JpaRepository<Week, Long>, JpaSpecificationExecutor<Week> {

}
