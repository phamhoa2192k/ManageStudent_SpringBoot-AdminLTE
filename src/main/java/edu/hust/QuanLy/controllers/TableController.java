package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.services.InfomationForUIService;


@Controller
@RequestMapping("/table")
public class TableController {
    @Autowired private InfomationForUIService infomationForUIService;

    @GetMapping(value="/student")
    public String getStudentTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        model.addAttribute("listStudents", infomationForUIService.getAllStudents());
        return "table_student";
    }

    @GetMapping(value="/teacher")
    public String getTeacherTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        model.addAttribute("listStudents", infomationForUIService.getAllStudents());
        return "table_teacher";
    }

    @GetMapping(value="/classroom")
    public String getClassroomTablePage(Model model) {
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        model.addAttribute("listClassrooms", infomationForUIService.getAllClassrooms());
        return "table_classroom";
    }
    
}
