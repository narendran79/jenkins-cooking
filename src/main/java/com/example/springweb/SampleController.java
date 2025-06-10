package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/pipeline")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to our sample DevOps project!");
        return "index";
    }
}
