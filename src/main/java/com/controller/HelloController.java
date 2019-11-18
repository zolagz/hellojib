package com.controller;


import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    public String index(){

        return "Hello, " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
