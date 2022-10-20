package com.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.models.LauraPortillo;
import com.java.repositories.LauraPortilloRepository;

@Service
public class LauraPortilloServiceImpl implements LauraPortilloService {

	@Autowired
	private LauraPortilloRepository lauraPortilloRepository;

	public List<LauraPortillo> getLauraPortillo() {
		return (List<LauraPortillo>) lauraPortilloRepository.findAll();
	}

	public LauraPortillo saveLauraPortillo(LauraPortillo lauraPortillo) {
		return lauraPortilloRepository.save(lauraPortillo);
	}

}
