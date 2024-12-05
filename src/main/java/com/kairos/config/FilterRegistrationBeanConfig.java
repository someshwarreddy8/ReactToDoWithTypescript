package com.kairos.config;

import com.kairos.filters.OncePerRequestFilter2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class FilterRegistrationBeanConfig {
    @Autowired
    private OncePerRequestFilter2 oncePerRequestFilter2;
    @Bean
    public FilterRegistrationBean<OncePerRequestFilter2> filterRegistrationBean() {

        // Filter Registration Bean
        FilterRegistrationBean<OncePerRequestFilter2> registrationBean = new FilterRegistrationBean<>();

        // Configure Authorization Filter
        registrationBean.setFilter(oncePerRequestFilter2);
        registrationBean.setName("fooBar");
        // Specify URL Pattern
        registrationBean.setUrlPatterns(Collections.singleton("/admin/*"));

        // Set the Execution Order of Filter
//        registrationBean.setOrder(2);

        return registrationBean;
    }
}
