package com.dogigiri.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String vetList() {
        return "vet/index";
    }
}
