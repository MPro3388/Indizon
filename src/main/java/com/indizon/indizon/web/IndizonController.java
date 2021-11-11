package com.indizon.indizon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.logging.Logger;

@RestController
public class IndizonController {

    @Autowired
    IndiService service;

    private static final Logger logger = null;

    @GetMapping(path="/")
    public ModelAndView showHWPage(){

        return new ModelAndView("Indizon");
    }

    @RequestMapping("/path/to/resource")
    public String resource(){return "Here ist my resource";}

    @RequestMapping(path="/answer/{prodauct}/{price}")
    public String pathParams(@PathVariable("product") String product,
                             @PathVariable("price") int price){
        return String.format(" These %s costs %s", product, price);
    }

    @RequestMapping(path="/answer")
    public String queryParams(@RequestParam("product") String product,
                             @RequestParam("price") int price){
        return String.format(" These %s costs %s", product, price);
    }

    @RequestMapping("/header")
    public String header(@RequestHeader(value="User-Agent") String userAgent){
        return String.format("User-Agent ist %s", userAgent);
    }


    @GetMapping(path="/get418")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public void getBadRequest() {}

    @GetMapping(path="/get200")
    @ResponseStatus(HttpStatus.OK)
    public void getOK() {}

    @GetMapping(value="/get", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> getJson() {
        return Map.of("product","Messerschärfer","price","2.99");
    }

    /*@PostMapping(value="/post", consumes=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SecurityProperties.User postJson(@RequestBody SecurityProperties.User user){
        logger.info("User", user);
        return user;
    }*/
}