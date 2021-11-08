package com.indizon.indizon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndizonController {

    @GetMapping(path="/")
    public ModelAndView showHWPage(){

        return new ModelAndView("Indizon");
    }
}