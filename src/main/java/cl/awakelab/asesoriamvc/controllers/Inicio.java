package cl.awakelab.asesoriamvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Inicio {
	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public String inicio() {
	
		return "index";
	}
}
