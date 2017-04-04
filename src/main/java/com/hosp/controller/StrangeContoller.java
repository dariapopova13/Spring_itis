package com.hosp.controller;

import com.hosp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;

/**
 * Created by Daria Popova on 21.03.17.
 */
@org.springframework.stereotype.Controller(value = "/")
public class StrangeContoller implements Controller {

    @Autowired
    private DoctorService doctorService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doctors",
                doctorService.findAll()
                .stream()
                .sorted((o1, o2) -> o1.getId().compareTo(o2.getId()))
                .collect(Collectors.toList()));
        modelAndView.setViewName("doctor");
        return modelAndView;
    }
}
