package com.upc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.model.Advisory;

@Repository
public interface AdvisoryRepository extends CrudRepository<Advisory, Long> {

}
