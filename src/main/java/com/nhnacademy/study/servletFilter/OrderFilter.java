package com.nhnacademy.study.servletFilter;

import java.util.Objects;

public class OrderFilter implements Filter {
    @Override
    public void doFilter(Request request, FilterChain filterChain) {
        if (request.getPath().equals("/order")) {
            Member member = (Member) request.get("member");
            if (Objects.nonNull(member) && !member.hasRole(Member.Role.NONE)) {
                System.out.println("path:" + request.getPath() + " : has access for all members");
                filterChain.doFilter(request);
            } else {
                System.out.println("path:" + request.getPath() + " : access denied for ADMIN, USER, MANAGER");
            }
        } else {
            System.out.println("OrderPageCheckFilter : 다음 필터로 넘김! ");
            filterChain.doFilter(request);
        }
    }
}
