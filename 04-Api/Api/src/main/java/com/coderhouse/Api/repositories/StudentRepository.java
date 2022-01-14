package com.coderhouse.Api.repositories;

import com.coderhouse.Api.database.Database;
import com.coderhouse.Api.models.StudentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepository {

    private Database database = new Database();

    public ArrayList<StudentModel> getAll() {
        return database.getStudents();
    }

    public StudentModel save(StudentModel s){
        return database.addStudent(s);
    }

    public StudentModel delete(String s){
        return database.deleteStudent(s);
    }

    public StudentModel getStudentBySurname(String s) {
        return database.getStudentBySurname(s);
    }

}
