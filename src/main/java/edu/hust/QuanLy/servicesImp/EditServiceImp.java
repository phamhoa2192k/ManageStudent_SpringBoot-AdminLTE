package edu.hust.QuanLy.servicesImp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.repositories.StudentRepository;
import edu.hust.QuanLy.repositories.TeacherRepository;
import edu.hust.QuanLy.services.EditService;

@Service
public class EditServiceImp implements EditService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private ClassroomRepository classroomRepository;

    // STUDENT
    @Override
    public void editStudent(Student student, String listIdClassrooms) {
        if (listIdClassrooms != null) {
            String[] listId = listIdClassrooms.split(",");
            Set<Classroom> classrooms = new HashSet<Classroom>();
            for (String Id : listId) {
                Classroom classroom = classroomRepository.findById(Long.parseLong(Id)).get();
                classrooms.add(classroom);
            }
            student.setClassrooms(classrooms);
        }
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    // TEACHER
    @Override
    public void editTeacher(Teacher teacher, String listIdClassrooms) {
        if (listIdClassrooms != null) {
            String[] listId = listIdClassrooms.split(",");
            Set<Classroom> classrooms = new HashSet<Classroom>();
            for (String Id : listId) {
                Classroom classroom = classroomRepository.findById(Long.parseLong(Id)).get();
                classrooms.add(classroom);
            }
            teacher.setClassrooms(classrooms);
        }
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(long id) {
        teacherRepository.deleteById(id);
    }

    // CLASSROOM
    @Override
    public void editClassroom(Classroom classroom) {
        Classroom c = classroomRepository.findById(classroom.getId()).get();
        classroom.setStudents(c.getStudents());
        classroom.setTeachers(c.getTeachers());
        classroomRepository.save(classroom);
    }

    @Override
    public void deleteClassroom(long id) {
        classroomRepository.deleteById(id);
    }

    @Override
    public void removeStudentFromClassroom(long idstudent, long idclassroom) {
        Classroom c = classroomRepository.findById(idclassroom).get();
        Student s = studentRepository.findById(idstudent).get();
        c.getStudents().remove(s);
        classroomRepository.save(c);
    }

    @Override
    public void removeTeacherFromClassroom(long idteacher, long idclassroom) {
        Classroom c = classroomRepository.findById(idclassroom).get();
        Teacher t = teacherRepository.findById(idteacher).get();
        c.getTeachers().remove(t);
        classroomRepository.save(c);
    }

}
