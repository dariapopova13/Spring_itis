package com.hosp.controller;

import com.hosp.dto.DoctorDto;
import com.hosp.dto.SpecialtyDto;
import com.hosp.service.ActionService;
import com.hosp.utills.RequestMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Daria Popova on 03.04.17.
 */
@Controller
@RequestMapping(value = RequestMappings.ACTION)
public class ActionController {

    @Autowired
    private ActionService actionService;

    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    @ResponseBody
    public List<SpecialtyDto> getSpecialties() {
        return actionService.getSpecialties();
    }

    @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DoctorDto getDoctor(@PathVariable Long id) {
        return actionService.getDoctor(id);
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String home() {
        return "";
    }
}
