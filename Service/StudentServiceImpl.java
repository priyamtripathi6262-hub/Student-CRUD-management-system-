package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    // ✅ CREATE
    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // ✅ READ ALL
    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // ✅ READ BY ID
    @Override
    public Student getStudentById(int id) {
        Optional<Student> student = repo.findById(id);
        return student.orElse(null);
    }

    // ✅ UPDATE
    @Override
    public Student updateStudent(int id, Student student) {

        Optional<Student> optional = repo.findById(id);

        if (optional.isPresent()) {
            Student existing = optional.get();

            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setMobileNumber(student.getMobileNumber());
            existing.setRollNumber(student.getRollNumber());
            existing.setAddress(student.getAddress());
            existing.setBranch(student.getBranch());

            return repo.save(existing);
        }

        return null;
    }

    // ✅ DELETE
    @Override
    public void deleteStudent(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    // 🔥 ✅ FINAL SEARCH (ID + NAME)
    @Override
    public List<Student> searchStudents(String key) {
        return repo.searchAll(key);
    }
}