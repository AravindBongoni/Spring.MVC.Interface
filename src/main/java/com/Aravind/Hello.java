package com.Aravind;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String display(HttpServletRequest request,Model model) {
		String name=request.getParameter("name");
		String pass= request.getParameter("pass");
		
		if(pass.equals("avi")) {
			String msg ="Hello "+ name;
			model.addAttribute("message",msg);
			return "view";
			
		}
		else {
			
			String msg ="Sorry "+ name +"You enterd incorrect password";
			model.addAttribute("message",msg);
			return "final";
		}
		
	}

}
