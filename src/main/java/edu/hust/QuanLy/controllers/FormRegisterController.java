package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.services.RepositoryService;
import edu.hust.QuanLy.services.RegisterService;

@Controller
@RequestMapping("/form")
public class FormRegisterController {
    @Autowired
    private RepositoryService infomationForGUIService;
    @Autowired
    private RegisterService registerService;

    // STUDENT
    @GetMapping(value = "/student")
    public String getStudentForm(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("student", new Student());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "form_student";
    }

    @PostMapping(value = "/student")
    public String postStudentRegisterForm(Student student, String list) {
        registerService.registerForStudent(student, list);
        return "register_success";
    }

    // TEACHER
    @GetMapping(value = "/teacher")
    public String getTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "form_teacher";
    }

    @PostMapping(value = "/teacher")
    public String postTeacherRegisterForm(Teacher teacher, String list) {
        registerService.registerForTeacher(teacher,list);
        return "register_success";
    }

    // CLASSROOM
    @GetMapping(value = "/classroom")
    public String getClassroomForm(Model model) {
        model.addAttribute("classroom", new Classroom());
        model.addAttribute("teachers", infomationForGUIService.getAllTeachers());
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "form_classroom";
    }

    @PostMapping(value = "/classroom")
    public String postClassroomRegisterForm(Classroom classroom) {
        registerService.registerForClassroom(classroom);
        return "register_success";
    }

}
