package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloWorld {


	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String mensaje = "<br><div style='text-align:center;'>"
				+ "<h3>********HELLO WORLD, Spring MVC tUTORIAL</H3>TEST</div><br><br> ";
		return new ModelAndView("welcome", "message1", mensaje);
	}
	
	
	@RequestMapping("/parameterexample")
	public ModelAndView holaMundo(@RequestParam(value = "name")String name){
		
		String mensaje = "<br><div style='text-align:center;'>"
				+ "<h3>********Hola"+name+", Spring MVC tUTORIAL</H3>TEST</div><br><br> ";
	 return new ModelAndView("test","message2", mensaje);
	}
	
 
	
 @RequestMapping("/pathvariableexample/{id}")
 public ModelAndView holamundo4(Model model, @PathVariable("id")String id){
	 
		String mensaje = "<br><div style='text-align:center;'>"
				+ "<h3>********Hola "+id+", Spring MVC tUTORIAL</H3>TEST</div><br><br> ";
	 return new ModelAndView("test","message2", mensaje); 
 }
	
}
