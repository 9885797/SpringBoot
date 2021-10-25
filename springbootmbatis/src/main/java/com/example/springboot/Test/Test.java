package com.example.springboot.Test;

import org.springframework.stereotype.Controller;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.RespectBinding;

@Controller
public class Test {
    @RequestWrapper(value = "/test")
    public @RespectBinding String test(){
        return "ces";
    }
}
