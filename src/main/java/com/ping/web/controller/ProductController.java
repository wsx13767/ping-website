package com.ping.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ping.formBean.ProductFormBean;
import com.ping.service.ProductService;

@Controller
@RequestMapping(value="/views/products")
public class ProductController {
	@Autowired
	private ProductService service;
	@RequestMapping(method = RequestMethod.GET)
	public String getPage(Model model) {
		model.addAttribute("products", service.selectForList());
		return "/jsp/products";
	}
	
    @RequestMapping(value="/productAdd", method = RequestMethod.POST)
    public String orderBuild(ProductFormBean formBean,HttpSession session) {
    	service.insert(formBean);
    	return "addSuccess";
    }
    
    @RequestMapping(value="/deleteProduct", method = RequestMethod.POST)
    public String deleteProduct(HttpServletRequest req,HttpSession session) {
    	System.out.println(req.getParameter("id"));
    	service.delete(Integer.valueOf(req.getParameter("id")));
    	return "deleteSuccess";
    }

}