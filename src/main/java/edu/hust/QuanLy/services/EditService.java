package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;

@Service
public interface EditService {
    void editStudent(Student student);
    void editTeacher(Teacher teacher);
    void editClassroom(Classroom classroom);

    void deleteStudent(long id);
    void deleteTeacher(long id);
    void deleteClassroom(long id);

}
