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
@RequestMapping(value = "/tag-demo")
public class TagDemoController {

    @RequestMapping(value = "message.html", method = RequestMethod.GET)
    public String message(){
        return "tag_demo/message";
    }
    
    @RequestMapping(value = "url.html", method = RequestMethod.GET)
    public String url(){
        return "tag_demo/url";
    }
    
    @RequestMapping(value = "full-url.html", method = RequestMethod.GET)
    public String fullUrl(){
        return "tag_demo/full_url";
    }
    
    @RequestMapping(value = "date-format.html", method = RequestMethod.GET)
    public String dateFormat(){
        return "tag_demo/date_format";
    }
    
    @RequestMapping(value = "cookie-value.html", method = RequestMethod.GET)
    public String cookieValue(){
        return "tag_demo/cookie_value";
    }
    
    @RequestMapping(value = "csrf-token.html", method = RequestMethod.GET)
    public String csrfToken(){
        return "tag_demo/csrf_token";
    }
    
}
