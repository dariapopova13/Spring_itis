package com.hosp;

import com.hosp.config.RootConfig;
import com.hosp.service.DoctorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Daria Popova on 21.03.17.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        DoctorService doctorService = context.getBean(DoctorService.class);
        doctorService.findAll().forEach(System.out::println);
    }
}
