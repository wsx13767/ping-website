package com.ping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/views/record")
public class RecordController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getPage() {
		return "/jsp/record";
	}
}
