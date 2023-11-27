package com.nhnacademy.study.servletFilter;

public class MainFilter implements Filter {
    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if (request.getPath().equals("/main")) {
            new NotFoundResponse().doResponse(request);
        } else {
            System.out.println("MainPageCheckFilter : 다음 필터로 넘김.");
            filterChain.doFilter(request);
        }
    }
}
