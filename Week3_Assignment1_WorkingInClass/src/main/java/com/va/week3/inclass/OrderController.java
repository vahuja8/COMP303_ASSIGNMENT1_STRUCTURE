package com.va.week3.inclass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	
	@GetMapping("/index")
	public String order(@ModelAttribute(name = "index") Order order, Model m) {
		String firstName = order.getFirstName();
		String middleName = order.getMiddleName();
		// do for rest..

		m.addAttribute(firstName);
		m.addAttribute(middleName);
		// do for rest..

		return "index";
	}

	@PostMapping("/index")
	public String orderSubmit(@ModelAttribute(name = "index") Order order, Model m) {
		String firstName = order.getFirstName();
		String middleName = order.getMiddleName();
		// do for rest..

		m.addAttribute(firstName);
		m.addAttribute(middleName);
		// do for rest..

		return "show-order";

	}

}
