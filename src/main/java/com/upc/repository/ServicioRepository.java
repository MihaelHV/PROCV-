package com.upc.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.model.Servicio;

@Repository
public interface ServicioRepository extends CrudRepository<Servicio, Integer> {


}
