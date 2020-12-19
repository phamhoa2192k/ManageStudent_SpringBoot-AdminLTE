package edu.hust.QuanLy.servicesImp;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.repositories.StudentRepository;
import edu.hust.QuanLy.repositories.TeacherRepository;
import edu.hust.QuanLy.services.InfomationForGUIService;

@Service
public class InfomationForGUIServiceImp implements InfomationForGUIService {
    @Autowired private ClassroomRepository classroomRepository;
    @Autowired private StudentRepository studentRepository;
    @Autowired private TeacherRepository teacherRepository;

    private String emailOfCurrentUser;

    @Override
    public List<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }

    @Override
    public String getEmailOfCurrentUser(){
        return this.emailOfCurrentUser;
    }

    @Override
    public String getBounceRate(){
        Random r = new Random();
        return "" +  (r.nextFloat() * 100);
    }

    @Override
    public void setEmailOfCurrentUser(String email){
        this.emailOfCurrentUser = email;
    }

    @Override
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
    

