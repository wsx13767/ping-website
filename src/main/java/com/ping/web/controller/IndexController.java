package com.ping.web.controller;


import java.io.File;
import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.ping.service.ProductService;




@Controller
@RequestMapping(value={"/"})
public class IndexController {
	@Autowired
	private ProductService service;
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String getPage(HttpServletRequest req) {
        return "/index";
    }
    
    @RequestMapping(value="/test", method = RequestMethod.POST)
	public void test(HttpServletResponse res) {

//		System.out.println("test");
		Gson gson = new Gson();
		String json = gson.toJson(service.selectForList());
		StringBuffer test = new StringBuffer("{\"rows\":");
		test.append(json);
		test.append("}");	
		try {
			res.getWriter().print(test.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
