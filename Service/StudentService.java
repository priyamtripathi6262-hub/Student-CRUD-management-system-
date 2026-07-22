package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    Student updateStudent(int id, Student student);

    void deleteStudent(int id);

    // 🔥 FINAL SEARCH METHOD (ID + NAME)
    List<Student> searchStudents(String key);
}