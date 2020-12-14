package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.services.InfomationForUIService;
import edu.hust.QuanLy.services.RegisterService;

@Controller
@RequestMapping("/form")
public class FormRegisterController {
    @Autowired private InfomationForUIService infomationForUIService;
    @Autowired private RegisterService registerService;

    @GetMapping(value="/student")
    public String getStudentForm(Model model) {
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        model.addAttribute("student", new Student());
        model.addAttribute("classrooms", infomationForUIService.getAllClassrooms());
        return "form_student";
    }

    @GetMapping(value="/teacher")
    public String getTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
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


}
