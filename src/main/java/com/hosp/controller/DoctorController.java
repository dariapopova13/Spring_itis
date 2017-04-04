package com.hosp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hosp.dto.DoctorDto;
import com.hosp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by Daria Popova on 21.03.17.
 */
@Controller
public class DoctorController {


    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest() {
        return "test";
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    @ResponseBody
    public String getDoctors() {
        String doctor = doctorService.findAll()
                .stream()
                .findAny()
                .get()
                .toString();
        return doctor;
    }

    @RequestMapping(value = "/docs", method = RequestMethod.GET)
    @ResponseBody
    private List<DoctorDto> getDocs() {
        return doctorService.getDocs();
    }

    @RequestMapping(value = "/docs/{id}", method = RequestMethod.GET)
    @ResponseBody
    private DoctorDto getDoc(@PathVariable Long id) {
        return doctorService.getDoctor(id);
    }

    @RequestMapping(value = "/docs/save", method = RequestMethod.POST)
    @ResponseBody
    private DoctorDto saveDoc(@RequestBody DoctorDto doctorDto) {
        return doctorService.saveOrUpdate(doctorDto);
    }


}
