package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.Classroom_Teacher;

@Repository
public interface Classroom_TeacherRepository extends JpaRepository<Classroom_Teacher, String> {
    
}
