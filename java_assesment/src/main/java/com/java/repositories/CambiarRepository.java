package com.java.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.models.Cambiar;

@Repository
public interface CambiarRepository extends CrudRepository<Cambiar, Integer>{

}
