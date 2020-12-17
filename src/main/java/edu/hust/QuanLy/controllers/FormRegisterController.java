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
import edu.hust.QuanLy.services.InfomationForGUIService;
import edu.hust.QuanLy.services.RegisterService;

@Controller
@RequestMapping("/form")
public class FormRegisterController {
    @Autowired private InfomationForGUIService infomationForGUIService;
    @Autowired private RegisterService registerService;

    @GetMapping(value="/student")
    public String getStudentForm(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("student", new Student());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "form_student";
    }

    @GetMapping(value="/teacher")
    public String getTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "form_teacher";
    }

    @PostMapping(value="/student")
    public String postStudentRegisterForm(Student student, String list) {
        registerService.registerForStudent(student, list);
        return "register_success";
    }

    @PostMapping(value="/teacher")
    public String postTeacherRegisterForm(Teacher teacher) {
        registerService.registerForTeacher(teacher);
        return "register_success";
    }

    @GetMapping(value = "/classroom")
    public String getClassroomForm(Model model){
        model.addAttribute("classroom", new Classroom());
        model.addAttribute("teachers", infomationForGUIService.getAllTeachers());
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "form_classroom";
    }

    @PostMapping(value="/classroom")
    public String postClassroomRegisterForm(Classroom classroom, String list) {
        registerService.registerForClassroom(classroom, list);
        return "register_success";
    }


}
