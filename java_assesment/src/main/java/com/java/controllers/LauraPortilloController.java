package com.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.models.LauraPortillo;
import com.java.services.LauraPortilloServiceImpl;

@Controller
@CrossOrigin
public class LauraPortilloController {

	@Autowired
	private LauraPortilloServiceImpl lauraPortilloService;

	@GetMapping("/table")
	public String getlauraPortillos(Model model) {
		List<LauraPortillo> listlauraPortillo = lauraPortilloService.getLauraPortillo();
		model.addAttribute("listlauraPortillo", listlauraPortillo);
		return "table";
	}

	@GetMapping("/table/create")
	public String createTable(Model model) {
		LauraPortillo lauraPortillo = new LauraPortillo();
		model.addAttribute("lauraPortillo", lauraPortillo);
		return "create_table";
	}

	@PostMapping("/process_create_table")
	public String createTableProcess(LauraPortillo lauraPortillo) {
		lauraPortilloService.saveLauraPortillo(lauraPortillo);
		return "redirect:/table";
	}

	@GetMapping("/table/postman")
	public List<LauraPortillo> getlauraPortillosPostMan() {
		return lauraPortilloService.getLauraPortillo();
	}

	@PostMapping("/table/create/postman")
	public String createTablePostman(@RequestBody LauraPortillo entry) throws Exception {
		lauraPortilloService.saveLauraPortillo(entry);
		return "Entry added.";
	}

}
