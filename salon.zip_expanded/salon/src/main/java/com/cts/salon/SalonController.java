package com.cts.salon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalonController {

	
	@RequestMapping("/salon")
	public String Salon()
	{
		return "salon";
	}
}
