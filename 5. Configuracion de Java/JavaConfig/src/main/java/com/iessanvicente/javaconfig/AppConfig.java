package com.iessanvicente.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.iessanvicente.javaconfig")
@PropertySource("classpath:/ejemplo.properties")
public class AppConfig {
}
