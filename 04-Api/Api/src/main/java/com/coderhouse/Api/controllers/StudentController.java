package com.coderhouse.Api.controllers;

import com.coderhouse.Api.models.StudentModel;
import com.coderhouse.Api.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping
    public StudentModel saveStudent(@RequestBody StudentModel student){
        return this.studentService.saveStudent(student);
    }


    @GetMapping
    public ArrayList<StudentModel> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping( path = "/{surname}")
    public StudentModel getStudentBySurname(@PathVariable("surname") String s){
        return this.studentService.getStudentBySurname(s);
    }


    @DeleteMapping(path = "/{surname}")
    public String deleteStudent ( @PathVariable("surname") String s ){
        if(this.studentService.deleteStudent(s) != null)
            return "Usuario eliminado correctamente";

        return "El usuario no se pudo eliminar";
    }

}
