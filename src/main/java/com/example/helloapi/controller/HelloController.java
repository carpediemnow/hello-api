package com.example.helloapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object getHello() {

        Map<String, String> map = new HashMap<>();

        map.put("rtn","hello2");

        return map;

    }

    @RequestMapping("/")
    public Object getRoot() {

        Map<String, String> map = new HashMap<>();

        map.put("rtn","root");

        return map;

    }
}
