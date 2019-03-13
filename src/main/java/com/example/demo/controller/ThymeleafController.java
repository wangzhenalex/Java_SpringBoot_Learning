package com.example.demo.controller;


import com.example.demo.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @Autowired
    private ServerSettings settings;

    @GetMapping("hello2")
    @ResponseBody
    public String index1(ModelMap modelMap){
        // modelMap.addAttribute("settings",settings);
        return "tl/index";
    }

    @GetMapping("hello")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("settings",settings);
        return "tl/index";
    }
}
