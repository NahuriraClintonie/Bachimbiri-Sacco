package com.pahappa.systems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaccoController {

    @GetMapping(value = {"/", "/hello"})
    public String home() {
        return "forward:/index.html";
    }
}
