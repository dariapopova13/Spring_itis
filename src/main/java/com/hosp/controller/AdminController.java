package com.hosp.controller;

import com.hosp.dto.DoctorDto;
import com.hosp.service.AdminService;
import com.hosp.utills.RequestMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daria Popova on 09.04.17.
 */
@Controller
@RequestMapping(value = RequestMappings.ADMIN)
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/doctor", method = RequestMethod.POST)
    @ResponseBody
    public DoctorDto saveDoctor(DoctorDto doctorDto) {
        return adminService.saveDoctor(doctorDto);
    }

}
