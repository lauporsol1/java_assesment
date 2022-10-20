package com.java.services;

import java.util.List;

import com.java.models.Cambiar;

public interface CambiarService {
	
	public List<Cambiar> getCambiar();
	public Cambiar saveCambiar(Cambiar cambiar);

}
