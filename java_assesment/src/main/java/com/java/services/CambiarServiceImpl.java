package com.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.models.Cambiar;
import com.java.repositories.CambiarRepository;

@Service
public class CambiarServiceImpl implements CambiarService {

	@Autowired
	private CambiarRepository cambiarRepository;

	public List<Cambiar> getCambiar() {
		return (List<Cambiar>) cambiarRepository.findAll();
	}

	public Cambiar saveCambiar(Cambiar cambiar) {
		return cambiarRepository.save(cambiar);
	}

}
