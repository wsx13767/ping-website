package com.ping.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.formBean.ProductFormBean;
import com.ping.service.ProductService;


@Controller
@RequestMapping(value={"/"})
public class IndexController {
	
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getPage() {
        return "/index";
    }
    

}
