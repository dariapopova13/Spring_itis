package com.hosp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Daria Popova on 21.03.17.
 */
@Configuration
@ComponentScan("com")
@EnableJpaRepositories(basePackages = "com.hosp.repository")
public class RootConfig {


}