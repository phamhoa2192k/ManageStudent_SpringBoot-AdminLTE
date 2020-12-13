package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    
}
