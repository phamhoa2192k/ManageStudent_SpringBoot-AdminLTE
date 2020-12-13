package edu.hust.QuanLy.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.repositories.StudentRepository;
import edu.hust.QuanLy.services.RegisterService;

@Service
public class RegisterServiceImp implements RegisterService {
    @Autowired private StudentRepository studentRepository;
    @Autowired private ClassroomRepository classroomRepository;

    @Override
    public void registerForStudent(Student student, String listIdClassRegister){
        
        
    }
}
