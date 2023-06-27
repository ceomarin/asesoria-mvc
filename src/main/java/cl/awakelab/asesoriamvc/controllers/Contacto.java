package cl.awakelab.asesoriamvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Contacto {

	@RequestMapping(value="/contacto", method=RequestMethod.GET)
	public String contacto() {
		return "contacto";
	}
	
}
