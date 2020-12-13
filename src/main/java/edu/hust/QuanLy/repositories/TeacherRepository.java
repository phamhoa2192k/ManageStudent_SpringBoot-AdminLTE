package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
    
}
