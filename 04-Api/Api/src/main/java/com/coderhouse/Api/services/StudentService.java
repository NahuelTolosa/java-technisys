package com.coderhouse.Api.services;

import com.coderhouse.Api.models.StudentModel;
import com.coderhouse.Api.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public ArrayList<StudentModel> getStudents() { return studentRepository.getAll(); }

    public StudentModel getStudentBySurname( String s) {
        return this.studentRepository.getStudentBySurname(s);
    }

    public StudentModel saveStudent(StudentModel s) { return studentRepository.save(s); }

    public StudentModel deleteStudent(String s) { return studentRepository.delete(s); }
}
