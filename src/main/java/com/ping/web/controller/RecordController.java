package com.ping.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/views/record")
public class RecordController {
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String getPage(HttpServletRequest req, HttpServletResponse res) {
		return "/jsp/record";
	}
	
	@RequestMapping(value="/search" , method = RequestMethod.POST)
	public String searchRecord(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/views/record").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "/jsp/record";
	}
}
