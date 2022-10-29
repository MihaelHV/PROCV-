package com.upc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
