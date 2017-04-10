package com.hosp.service;

import com.hosp.model.Schedule;
import com.hosp.model.User;
import com.hosp.repository.ScheduleRepository;
import com.hosp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public void entroll(Long scheduleId) {
        Assert.notNull(scheduleId);
        Schedule schedule = scheduleRepository.findOne(scheduleId);
        if (schedule.getIsFree() <= 20)
            schedule.getUsers().add(this.getCurrentUser());
        scheduleRepository.save(schedule);
    }

    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public void deleteEntroll(Long scheduleId) {
        Assert.notNull(scheduleId);
        Schedule schedule = scheduleRepository.findOne(scheduleId);
        schedule.getUsers().remove(this.getCurrentUser());
        scheduleRepository.save(schedule);
    }
}
