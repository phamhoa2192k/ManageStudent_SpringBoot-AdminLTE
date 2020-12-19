package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.services.InfomationForGUIService;

@Controller
public class MainController {
    @Autowired private InfomationForGUIService infomationForGUIService;
    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "home";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("totalOfStudents", infomationForGUIService.getAllStudents().size());
        model.addAttribute("bounceRate", infomationForGUIService.getBounceRate());
        model.addAttribute("totalOfTeachers", infomationForGUIService.getAllTeachers().size());
        model.addAttribute("totalOfClassrooms", infomationForGUIService.getAllClassrooms().size());
        model.addAttribute("dataForPieChart", infomationForGUIService.getDataForPieChart());
        model.addAttribute("dataForBarChart", infomationForGUIService.getDataForBarChart());
        return "dashboard";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "news";
    }
    
    @GetMapping("/calender")
    public String getCalenderPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        model.addAttribute("classrooms", infomationForGUIService.getAllClassrooms());
        return "calender";
    }

    @GetMapping("/book")
    public String getBookPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "book";
    }

    @GetMapping("/exam")
    public String getExamPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "exam";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "contact";
    }

}
