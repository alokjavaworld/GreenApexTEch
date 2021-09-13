package com.greenapex;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	
	@GetMapping("/show")
	public String showPages(Model m) {
		System.out.println("EmpController.showPages()");
		m.addAttribute("msg", "Welcome  App :"+new Date());
		return "Home";
	}
	
	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("message", " Jsp To Controller To Jsp :"+new Date());
		return "Home1";
	}

}
