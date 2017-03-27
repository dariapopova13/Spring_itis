package com.itis.spring.service;

import java.util.List;

/**
 * Created by Daria Popova on 21.03.17.
 */
public interface AbstractService<T> {

    T findOne(Long id);

    List<T> findAll();

    T saveOrUpdate(T t);

    void delete(Long id);

}
