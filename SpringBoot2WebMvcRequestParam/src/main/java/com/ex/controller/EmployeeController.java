package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/data")
	public String showData(
			//By default value is string in this parameter
			@RequestParam(required=false, defaultValue="0") Integer eid,
			@RequestParam(required=false, defaultValue="Rakesh") String ename,
			@RequestParam(required=false, defaultValue="4.4") Double esal,
			Model model
			) {
		model.addAttribute("eid",eid);
		model.addAttribute("ename",ename);
		model.addAttribute("esal",esal);
		return "EmployeeData";
	}

}
