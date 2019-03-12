package com.example.demo.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/hello")
    @ResponseBody/**/
    String home(){
        return "hello world";
    }
}
