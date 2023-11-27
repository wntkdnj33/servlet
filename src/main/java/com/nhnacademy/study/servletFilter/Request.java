package com.nhnacademy.study.servletFilter;

import java.util.HashMap;
import java.util.Map;


public class Request {
    private final String path;
    private final Map<String, Object> data = new HashMap<>();

    protected Request(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }
}
