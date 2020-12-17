package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
/**
 * Là interface cung cấp dịch vụ lưu thông tin đăng kí của sinh viên, giảng viên, lớp học
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

    /**
     * Phương thức lưu thông tin tạo mới lớp học xuống database
     * @param classroom
     * @param listIdTeacher : String chứa thông tin các giảng viên dạy lớp, cách nhau bởi dấu ','
     */
    public void registerForClassroom(Classroom classroom, String listIdTeacher);
}
