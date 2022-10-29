package com.upc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.model.ServicioXAdviser;

@Repository
public interface ServicioXAdviserRepository extends CrudRepository<ServicioXAdviser, Integer> {

}
