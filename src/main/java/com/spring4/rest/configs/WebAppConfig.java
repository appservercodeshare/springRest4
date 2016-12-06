package com.spring4.rest.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan( basePackages = {"com.spring4.rest.controllers"})
public class WebAppConfig {
}
