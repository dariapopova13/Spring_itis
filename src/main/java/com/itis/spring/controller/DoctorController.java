package com.itis.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itis.spring.dto.DoctorDto;
import com.itis.spring.service.DoctorService;
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
    private ObjectMapper objectMapper;
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

    @RequestMapping(value = "/docs/save/json", method = RequestMethod.POST)
    @ResponseBody
    private DoctorDto saveDocJson(@RequestBody String json) {
        DoctorDto doctorDto = null;
        try {
            doctorDto = objectMapper.readValue(json, DoctorDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doctorDto == null ? null : doctorService.saveOrUpdate(doctorDto);
    }

}
