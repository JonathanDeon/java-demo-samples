package com.jonathan.eh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonathan.eh.model.Activity;

@Controller
//@RequestMapping(value="/app")
public class ActivityController {
	
	@RequestMapping(value="/greeting")
	public String getWelcomeMessage(Model model) {
		model.addAttribute("msg","Hi Spring");
		return "welcome";
	}
	
	@RequestMapping(value="/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity) {
		System.out.println(activity.getActivityName());
		if(activity.getActivityName()==null) {
			return "addActivity";
		}else {
			return "forward:addSubActivity.html";
		}
		
	}
	
	@RequestMapping(value="/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity) {
		System.out.println("SubActivity : "+activity.getActivityName());
		return "addActivity";
	}

}
