package com.victolee.signuplogin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {


    @GetMapping(value = "/members")
    public Map<String, Object> testByResponseBody() {


            Map<String, Object> member = new HashMap<>();
            member.put("Freq",12.35);
            member.put("Pulses",2584);
            member.put("Liters",5.74);
            member.put("Mq2",71);
            member.put("Mq5",61);
            member.put("Mq7",82);
            member.put("body",0);
            member.put("humidity",67);
            member.put("temperature",29.6);
            member.put("electric",0);
            member.put("CDS",768);
            member.put("result",0);



        return member;
    }

}

