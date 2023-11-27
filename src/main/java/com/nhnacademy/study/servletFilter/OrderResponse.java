package com.nhnacademy.study.servletFilter;

public class OrderResponse implements Response {
    @Override
    public void doResponse(Request request) {
        System.out.println("###### response:OrderResponse #####");
        Member member = (Member) request.get("member");
        System.out.println("아이디:" + member.getId());
        System.out.println("이름:" + member.getName());
        System.out.println("등급:" + Member.Role.USER);
        System.out.println("주문내역: ");
        System.out.println("1. 상품: 스마트폰, 가격: 1,000,000");
        System.out.println("2. 상품: 노트북, 가격: 790,000");
        System.out.println("do something ... ORDER ...");
    }
}
