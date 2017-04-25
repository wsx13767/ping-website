package com.ping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/"})
public class IndexController {
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getPage() {
        return "/index";
    }
}
