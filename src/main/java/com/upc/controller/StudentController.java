package com.upc.controller;

import com.upc.exception.StudentNotFoundException;
import com.upc.model.Student;
import com.upc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students",method = RequestMethod.POST)
    public ResponseEntity<Object> createStudent(@RequestBody Student student)
    {
        student=studentService.createStudent(student);
        return new ResponseEntity<>("El empleado fue creado con exito con el id= "+student.getIdStudent(), HttpStatus.CREATED);
    }

    @RequestMapping(value= "/students/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateStudent(@PathVariable("id") int id,@RequestBody Student student){

        boolean isStudentExist = studentService.isStudentExist(id);
        if (isStudentExist)
        {
            student.setIdStudent(id);
            studentService.updateStudent(student);
            return new ResponseEntity<>("Student is updated successsfully", HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getStudent(@PathVariable("id") int id)
    {
        boolean isStudentExist = studentService.isStudentExist(id);
        if (isStudentExist)
        {
          Student student = studentService.getStudent(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<Object> getStudents()
    {
        List<Student> studentList = studentService.getStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteStudent(@PathVariable("id") int id)
    {
        boolean isStudentExist = studentService.isStudentExist(id);
        if (isStudentExist)
        {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("Student is deleted successsfully", HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }


}
