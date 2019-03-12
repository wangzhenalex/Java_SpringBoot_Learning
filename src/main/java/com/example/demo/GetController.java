package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/hello")
    @ResponseBody/**/
    String home(){
        return "hello world 4";
    }

    @GetMapping("/v1/api/test/customs")
    @ResponseBody/**/
    String homeCustoms(){
        return "/v1/api/test/customs";
    }

    @GetMapping("/api2/v1/account")
    @ResponseBody/**/
    String homeCustomIntercepts(){
        System.out.println("customs intercept ---> /api2/v1/account");
        return "/api2/v1/account";
    }
}
