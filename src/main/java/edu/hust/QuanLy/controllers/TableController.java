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
    @Autowired
    private InfomationForGUIService infomationForGUIService;
    @Autowired
    private EditService editService;

    // STUDENT
    @GetMapping(value = "/student")
    public String getStudentTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listStudents", infomationForGUIService.getAllStudents());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "table_student";
    }

    @PostMapping(value = "/student/edit")
    public String postEditFormStudent(Student student,String list, Model model) {
        editService.editStudent(student, list);
        return "redirect:/table/student";
    }

    @PostMapping(value = "/student/delete")
    public String postDeleteFormStudent(@RequestParam long id) {
        editService.deleteStudent(id);
        return "redirect:/table/student";
    }

    // TEACHER
    @GetMapping(value = "/teacher")
    public String getTeacherTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listTeacher", infomationForGUIService.getAllTeachers());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "table_teacher";
    }

    @PostMapping(value = "/teacher/edit")
    public String postEditFormTeacher(Teacher teacher,String list, Model model) {
        editService.editTeacher(teacher, list);
        return "redirect:/table/teacher";
    }
    
    @PostMapping(value = "/teacher/delete")
    public String postDeleteFormTeacher(@RequestParam long id) {
        editService.deleteTeacher(id);
        return "redirect:/table/teacher";
    }

    // CLASSROOM
    @GetMapping(value = "/classroom")
    public String getClassroomTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("listClassrooms", infomationForGUIService.getAllClassrooms());
        return "table_classroom";
    }

    @PostMapping(value = "/classroom/edit")
    public String postEditFormClassroom(Classroom classroom, Model model) {
        editService.editClassroom(classroom);
        return "redirect:/table/classroom";
    }

    @PostMapping(value = "/classroom/delete")
    public String postDeleteFormClassroom(@RequestParam long id) {
        editService.deleteClassroom(id);
        return "redirect:/table/classroom";
    }

}
