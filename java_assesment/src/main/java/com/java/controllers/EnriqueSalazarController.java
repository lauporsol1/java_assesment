package com.java.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.models.EnriqueSalazar;
import com.java.services.EnriqueSalazarServiceImpl;

@Controller
public class EnriqueSalazarController {
	
	@Autowired
	private EnriqueSalazarServiceImpl enriqueSalazarService;
	
	@GetMapping("/table")
	public String getEnriqueSalazars(Model model) {
		List<EnriqueSalazar> listEnriqueSalazars = enriqueSalazarService.getEnriqueSalazar();
		model.addAttribute("listEnriqueSalazars", listEnriqueSalazars);
		return "table";
	}
	@GetMapping("/table/create")
	public String createTable(Model model) {
		EnriqueSalazar enriqueSalazar = new EnriqueSalazar();
		model.addAttribute("enriqueSalazar", enriqueSalazar);
		return "create_table";
	}
	
	@PostMapping("/process_create_table")
	public String createTableProcess(EnriqueSalazar enriqueSalazar) {
		enriqueSalazarService.saveEnriqueSalazar(enriqueSalazar);
		return "redirect:/table";
	}
	
	// TO USE WITH POSTMAN
	
	@GetMapping("/enrique_salazar")
	public List<EnriqueSalazar> getEnriqueSalazars() {

		return enriqueSalazarService.getEnriqueSalazar();
	}
	
	@PostMapping("/add_enrique_salazar")
	public String addTable(@RequestBody EnriqueSalazar enriqueSalazar) throws Exception {
		enriqueSalazarService.saveEnriqueSalazar(enriqueSalazar);
		return "New Enrique Salazar added to EnriqueSalazar";
	}


}
