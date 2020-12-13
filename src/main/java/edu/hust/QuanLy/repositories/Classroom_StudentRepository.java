package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.Classroom_Student;

@Repository
public interface Classroom_StudentRepository extends JpaRepository<Classroom_Student, String> {
    
}
