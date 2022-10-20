package com.java.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.models.EnriqueSalazar;

@Repository
public interface EnriqueSalazarRepository extends CrudRepository<EnriqueSalazar, Integer>{

}
