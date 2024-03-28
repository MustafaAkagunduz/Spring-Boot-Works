package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //Long olmasının sebebi, id'mizin long olması

    //buraya query geçirebiliyoruz.
    //@Query("SELECT s FROM Student s WHERE s.mail = ?!")
    Optional<Student> findStudentByEmail(String email);
}
