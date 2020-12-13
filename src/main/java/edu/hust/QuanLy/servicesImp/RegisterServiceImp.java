package edu.hust.QuanLy.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.repositories.StudentRepository;
import edu.hust.QuanLy.repositories.TeacherRepository;
import edu.hust.QuanLy.services.RegisterService;

/**
 * Lớp thực thi của interface RegisterService
 */
@Service
public class RegisterServiceImp implements RegisterService {
    @Autowired private StudentRepository studentRepository;
    @Autowired private ClassroomRepository classroomtRepository;
    @Autowired private TeacherRepository teacherRepository;

    @Override
    public void registerForStudent(Student student, String listIdClassRegister){
        String[] listId = listIdClassRegister.split(",");
        for(String Id : listId ){
            Classroom classroom = classroomtRepository.findById(Id).get();
            student.getClassrooms().add(classroom);
            classroom.getStudents().add(student);
        }
        studentRepository.save(student);
    }

    @Override
    public void registerForTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
