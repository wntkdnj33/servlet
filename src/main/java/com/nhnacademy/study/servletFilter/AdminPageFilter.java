package com.nhnacademy.study.servletFilter;

import java.util.Objects;


public class AdminPageFilter implements Filter {

    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if (request.getPath().equals("/admin")) {
            Member member = (Member) request.get("member");
            if (Objects.nonNull(member)) {
                if (member.hasRole(Member.Role.ADMIN)) {
                    System.out.println("path: " + request.getPath() + " : has ADMIN");
                    filterChain.doFilter(request);
                } else {
                    System.out.println("path : " + request.getPath() + " : has ADMIN");
                }
            }
        } else {
            System.out.println("AdminPageFilter : 다음 필터로 넘김 !");
            filterChain.doFilter(request);
        }
    }
}
