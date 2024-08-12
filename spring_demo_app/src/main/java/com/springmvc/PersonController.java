package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	
	@RequestMapping("createPerson")
	public ModelAndView createPerson() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("personmodel", new Person());
		mv.setViewName("person.jsp");
		return mv;
	}
	
	@RequestMapping("saveperson")
	public ModelAndView saveperson(@ModelAttribute Person p) {
		
		System.out.println("Id:"+p.getId());
		System.out.println("name:"+p.getName());
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("result","person is saved");
		mv.setViewName("phome.jsp");
		return mv;
		
	}

}
