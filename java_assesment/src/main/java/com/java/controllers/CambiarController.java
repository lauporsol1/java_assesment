package com.java.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	@GetMapping("/table/create")
	public String createTable(Model model) {
		Cambiar cambiar = new Cambiar();
		model.addAttribute("cambiar", cambiar);
		return "create_table";
	}
	
	@PostMapping("/process_creat_table")
	public String createTableProcess(Cambiar cambiar) {
		cambiarService.saveCambiar(cambiar);
		return "redirect:/table";
	}


}
