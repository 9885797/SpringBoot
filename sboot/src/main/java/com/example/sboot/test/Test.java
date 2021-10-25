package com.example.sboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Test {
    @RequestMapping(value="test")
    public @ResponseBody String test(){
        return "test";
    }
}
