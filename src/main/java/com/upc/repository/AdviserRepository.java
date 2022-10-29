package com.upc.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.model.Adviser;

@Repository
public interface AdviserRepository extends CrudRepository<Adviser, Long> {


}
