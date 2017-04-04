package com.hosp.repository;


import com.hosp.model.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Daria Popova on 02.04.17.
 */
@Repository
@Lazy
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}
