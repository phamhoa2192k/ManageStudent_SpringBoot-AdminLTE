package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Student;

@Service
public interface RegisterService {
    /* listIdClassRegister là một dãy các id ngăn cách bởi dấy ',' */
    public void registerForStudent(Student student, String listIdClassRegister); 
}
