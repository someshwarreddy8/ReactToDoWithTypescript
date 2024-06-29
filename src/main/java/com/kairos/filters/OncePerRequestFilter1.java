package com.kairos.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
//@Order(1)
public class OncePerRequestFilter1 extends OncePerRequestFilter {
    @Override
    public void doFilterInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("In OncePerRequestFilter1 filter");
        System.out.println("method: "+servletRequest.getMethod());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
