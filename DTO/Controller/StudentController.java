package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // ✅ CREATE
    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentDTO dto) {

        Student s = new Student();
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setMobileNumber(dto.getMobileNumber());
        s.setRollNumber(dto.getRollNumber());
        s.setAddress(dto.getAddress());
        s.setBranch(dto.getBranch());

        return service.saveStudent(s);
    }

    // ✅ READ ALL
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // ✅ READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // ✅ UPDATE
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody StudentDTO dto) {

        Student s = new Student();
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setMobileNumber(dto.getMobileNumber());
        s.setRollNumber(dto.getRollNumber());
        s.setAddress(dto.getAddress());
        s.setBranch(dto.getBranch());

        return service.updateStudent(id, s);
    }

    // ✅ DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Deleted";
    }

    // 🔥 ✅ SEARCH (FINAL ADD)
    @GetMapping("/search/{key}")
    public List<Student> searchStudents(@PathVariable String key) {
        return service.searchStudents(key);
    }



    @GetMapping("/test")
public String getStudent() {
    int a = 10 / 0;
    return "Student Data";
}
}