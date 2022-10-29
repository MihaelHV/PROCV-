package com.upc.service;

import com.upc.model.Student;

import java.util.List;

public interface StudentService  {
    Student createStudent(Student student);

    void updateStudent(Student student);

    Student getStudent(int id);

    List<Student> getStudents();

    void deleteStudent(int id);

    boolean isStudentExist(int id);

}
