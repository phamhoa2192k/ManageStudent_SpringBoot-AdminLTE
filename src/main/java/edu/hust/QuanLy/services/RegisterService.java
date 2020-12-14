package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
/**
 * Là interface cung cấp dịch vụ lưu thông tin đăng kí của sinh viên và giảng viên
 * xuống database
 */
@Service
public interface RegisterService {
    /**
     * Phương thức lưu thông tin của sinh viên đăng ký xuống database
     * @param student : Lớp Student
     * @param listIdClassRegister : String chứa thông tin các lóp đăng kí học, cách nhau bởi dấu ','
     */
    public void registerForStudent(Student student, String listIdClassRegister);

    /**
     * Phương thức lưu thông tin của giảng viên đăng ký xuống database
     * @param teacher : Lớp Teacher
     */
    public void registerForTeacher(Teacher teacher);
    public void registerForClassroom(Classroom classroom, String listIdTeacher);
}
