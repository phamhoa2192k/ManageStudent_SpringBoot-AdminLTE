package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;

/**
 * Interface cung cấp các phương thức cho phép sửa đổi, xóa thông tin giáo viên,
 * lớp học, sinh viên
 */
@Service
public interface EditService {
    // STUDENT
    void editStudent(Student student, String listIdClassrooms);

    void deleteStudent(long id);

    // TEACHER
    void editTeacher(Teacher teacher, String listIdClassrooms);

    void deleteTeacher(long id);

    // CLASSROOM
    void editClassroom(Classroom classroom);

    void deleteClassroom(long id);

    void removeStudentFromClassroom(long idstudent, long idclassroom);

    void removeTeacherFromClassroom(long idteacher, long idclassroom);

}
