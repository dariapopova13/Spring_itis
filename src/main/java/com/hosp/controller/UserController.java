package com.hosp.controller;

import com.hosp.service.UserService;
import com.hosp.utills.RequestMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daria Popova on 09.04.17.
 */
@RequestMapping(value = RequestMappings.USER)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "enroll", method = RequestMethod.POST)
    public void entroll(Long scheduleId){
        userService.entroll(scheduleId);
    }

    @RequestMapping(value = "enroll/delete", method = RequestMethod.POST)
    public void deleteEntroll(Long scheduleId){
        userService.deleteEntroll(scheduleId);
    }

}
