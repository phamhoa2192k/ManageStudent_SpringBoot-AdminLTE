package edu.hust.QuanLy.servicesImp;

import java.util.ArrayList;
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

    @Override
    public List<Integer> getDataForPieChart(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(0);
        return li;
    }

    @Override
    public List<Integer> getDataForBarChart(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(15);
        li.add(9);
        li.add(20);
        li.add(24);
        li.add(23);
        li.add(5);
        li.add(3);
        li.add(1);
        li.add(0);
        li.add(4);
        li.add(0);
        return li;
    }
}
    

