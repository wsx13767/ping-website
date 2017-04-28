package com.ping.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.formBean.OrderFormBean;
import com.ping.service.OrderBuildService;

@Controller
@RequestMapping(value={"/"})
public class IndexController {
	@Autowired
	private OrderBuildService service;
	
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getPage() {
        return "/index";
    }
    
    
    @RequestMapping(value="orderBuild", method = RequestMethod.POST)
    public void orderBuild(OrderFormBean formBean,HttpSession session) {
    	System.out.println(formBean);
    	service.build(session, formBean);
    }
}
