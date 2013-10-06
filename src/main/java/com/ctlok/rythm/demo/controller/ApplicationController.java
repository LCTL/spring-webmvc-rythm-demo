package com.ctlok.rythm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Lawrence Cheung
 *
 */
@Controller
public class ApplicationController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        return "main";
    }
    
}
