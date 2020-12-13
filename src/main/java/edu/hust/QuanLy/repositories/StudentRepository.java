package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    
}
