package com.java.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.models.LauraPortillo;

@Repository
public interface LauraPortilloRepository extends CrudRepository<LauraPortillo, Integer>{

}
