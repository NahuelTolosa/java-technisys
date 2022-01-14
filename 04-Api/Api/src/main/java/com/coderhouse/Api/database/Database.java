package com.coderhouse.Api.database;

import com.coderhouse.Api.models.StudentModel;

import java.util.ArrayList;
import java.util.stream.Stream;

//Simula una base de datos
public class Database {

    private ArrayList<StudentModel> students = new ArrayList<>();

    public Database() {
        students.add(new StudentModel("Nombre1", "Apellido1","estudiante1@mail.com"));
        students.add(new StudentModel("Nombre2", "Apellido2","estudiante2@mail.com"));
        students.add(new StudentModel("Nombre3", "Apellido3","estudiante3@mail.com"));
        students.add(new StudentModel("Nombre4", "Apellido4","estudiante4@mail.com"));
        students.add(new StudentModel("Nombre5", "Apellido5","estudiante5@mail.com"));
        students.add(new StudentModel("Nombre6", "Apellido6","estudiante6@mail.com"));
        students.add(new StudentModel("Nombre7", "Apellido7","estudiante7@mail.com"));
        students.add(new StudentModel("Nombre8", "Apellido8","estudiante8@mail.com"));
        students.add(new StudentModel("Nombre9", "Apellido9","estudiante9@mail.com"));
    }


    public StudentModel addStudent (StudentModel s) {
        students.add(new StudentModel(s.getName(), s.getSurname(), s.getEmail()));
        return s;
    }


    public ArrayList<StudentModel> getStudents() {
        return students;
    }

    public StudentModel getStudentBySurname(String s ) {

        for ( StudentModel std : students ) {

            if( s.equals(std.getSurname()) )
                return std;

        }

        return null;
    }



    public StudentModel deleteStudent ( String surname ){

        int index = getStudentIndex(surname);

        if(index >= 0)
            return students.remove(index);

        return null;
    }

    public void deleteAll() {
        students.clear();
    }


    /* Aux */
    private Integer getStudentIndex( String surname ){

        Integer index = 0;

        for ( StudentModel std : students ) {

            if( surname.equals(std.getName()) )
                return index;

            index++;
        }

        return -1;
    }

}
