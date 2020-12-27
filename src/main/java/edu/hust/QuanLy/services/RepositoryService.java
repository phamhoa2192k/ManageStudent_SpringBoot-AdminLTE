package edu.hust.QuanLy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;

/**
 * Interface cung cấp các phương thức tìm kiếm thông tin phục vụ cho giao diện phía người dùng
 */
@Service
public interface RepositoryService {
    void setEmailOfCurrentUser(String email);
    String getEmailOfCurrentUser();
    String getBounceRate();
    List<Classroom> getAllClassrooms();
    List<Teacher> getAllTeachers();
    List<Student> getAllStudents();
    List<Integer> getDataForPieChart();
    List<Integer> getDataForBarChart();
    Classroom findClassroomById(long id);
    Student findStudentById(long id);
    Teacher findTeacherById(long id);
}
