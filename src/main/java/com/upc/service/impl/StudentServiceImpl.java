package com.upc.service.impl;

import com.upc.model.Student;
import com.upc.repository.StudentRepository;
import com.upc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {
        Optional<Student> optional=studentRepository.findById(id);
        return null;
    }

    @Override
    public List<Student> getStudents() {

        return (List<Student>)studentRepository.findAll();
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public boolean isStudentExist(int id) {
        return studentRepository.existsById(id);
    }

}
