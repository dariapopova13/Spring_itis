package com.hosp.model.common;

import java.io.Serializable;

/**
 * Created by Daria Popova on 24.03.17.
 */
public interface Entity<T> extends Serializable {

    T getId();

    void setId(T t);
}
