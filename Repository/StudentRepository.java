package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // 🔥 FINAL SEARCH (ID + NAME)
    @Query("SELECT s FROM Student s WHERE " +
           "LOWER(s.name) LIKE LOWER(CONCAT('%', :key, '%')) OR " +
           "CAST(s.id as string) LIKE CONCAT('%', :key, '%')")
    List<Student> searchAll(@Param("key") String key);
}