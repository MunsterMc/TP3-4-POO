package com.tp3messaoudNael.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        return "form";
    }
}
