package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.services.EditService;
import edu.hust.QuanLy.services.InfomationForGUIService;


@Controller
@RequestMapping("/table")
public class TableController {
    @Autowired private InfomationForGUIService infomationForGUIService;
    @Autowired private EditService editService;

    @GetMapping(value="/student")
    public String getStudentTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listStudents", infomationForGUIService.getAllStudents());
        return "table_student";
    }

    @GetMapping(value="/teacher")
    public String getTeacherTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listTeacher", infomationForGUIService.getAllTeachers());
        return "table_teacher";
    }

    @GetMapping(value="/classroom")
    public String getClassroomTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listClassrooms", infomationForGUIService.getAllClassrooms());
        return "table_classroom";
    }

    @PostMapping(value = "/student/edit")
    public String postEditFormStudent(Student student, Model model){
        editService.editStudent(student);
        return "redirect:/table/student";
    }

    @PostMapping(value = "/student/delete")
    public String postEditFormStudent(@RequestParam long id){
        editService.deleteStudent(id);
        return "redirect:/table/student";
    }

    @PostMapping(value = "/teacher/edit")
    public String postEditFormTeacher(Teacher teacher, Model model){
        editService.editTeacher(teacher);
        return "redirect:/table/teacher";
    }

    @PostMapping(value = "/classroom/edit")
    public String postEditFormClassroom(Classroom classroom, Model model){
        editService.editClassroom(classroom);
        return "redirect:/table/classroom";
    }
    
}
