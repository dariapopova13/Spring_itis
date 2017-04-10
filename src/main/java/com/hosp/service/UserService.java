package com.hosp.service;

import com.hosp.model.User;

/**
 * Created by Daria Popova on 09.04.17.
 */
public interface UserService {

    void entroll(Long scheduleId);

    void deleteEntroll(Long scheduleId);

    User getCurrentUser();
}
