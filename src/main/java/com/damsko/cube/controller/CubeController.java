package com.damsko.cube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CubeController {
    @GetMapping
    public String showCube() {
        return "index";
    }
}
