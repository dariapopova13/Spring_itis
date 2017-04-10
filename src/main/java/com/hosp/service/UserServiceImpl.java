package com.hosp.service;

import com.hosp.model.Schedule;
import com.hosp.model.User;
import com.hosp.repository.ScheduleRepository;
import com.hosp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("Username '%s' not found", username));
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getRoles().forEach(role -> {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
