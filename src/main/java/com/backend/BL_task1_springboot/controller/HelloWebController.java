package com.backend.BL_task1_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

    @RequestMapping("/")
    public String index(){
        return "Hello from BridgeLabz";
    }
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("messagge","This is custom greeting");
        return "message";
    }
}
