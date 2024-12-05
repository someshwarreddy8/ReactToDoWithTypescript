package com.kairos.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
//@Order(2)
//@WebFilter(urlPatterns = {"/admin/*"})
public class OncePerRequestFilter2 extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("In OncePerRequestFilter2 filter::::");
        System.out.println("port: "+ servletRequest.getLocalPort());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
