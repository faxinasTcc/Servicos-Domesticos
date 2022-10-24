package com.itb.tcc.servicosdomesticos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicosdomesticos/v1")
public class IndexController {

	@GetMapping("/index")
	public String index () {
		return "index";
	}
	
}
