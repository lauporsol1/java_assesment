package com.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.models.EnriqueSalazar;
import com.java.repositories.EnriqueSalazarRepository;

@Service
public class EnriqueSalazarServiceImpl implements EnriqueSalazarService {

	@Autowired
	private EnriqueSalazarRepository enriqueSalazarRepository;

	public List<EnriqueSalazar> getEnriqueSalazar() {
		return (List<EnriqueSalazar>) enriqueSalazarRepository.findAll();
	}

	public EnriqueSalazar saveEnriqueSalazar(EnriqueSalazar enriqueSalazar) {
		return enriqueSalazarRepository.save(enriqueSalazar);
	}

}
