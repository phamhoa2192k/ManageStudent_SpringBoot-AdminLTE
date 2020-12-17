package edu.hust.QuanLy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;

@Service
public interface InfomationForGUIService {
    void setEmailOfCurrentUser(String email);
    List<Classroom> getAllClassrooms();
    String getEmailOfCurrentUser();
    List<Teacher> getAllTeachers();
    List<Student> getAllStudents();
    
}
