package com.java.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.models.Cambiar;
import com.java.services.CambiarServiceImpl;

@Controller
public class CambiarController {
	
	@Autowired
	private CambiarServiceImpl cambiarService;
	
	@GetMapping("/table")
	public String getCambiars(Model model) {
		List<Cambiar> listCambiars = cambiarService.getCambiar();
		model.addAttribute("listCambiars", listCambiars);
		return "table";
	}


}
