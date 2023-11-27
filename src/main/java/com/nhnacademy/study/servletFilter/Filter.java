package com.nhnacademy.study.servletFilter;

public interface Filter {
    void doFilter(Request request, FilterChain filterChain);
}
