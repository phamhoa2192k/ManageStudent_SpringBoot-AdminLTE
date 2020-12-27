package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.services.RepositoryService;

@Controller
public class MainController {
    @Autowired private RepositoryService repositoryService;
    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        return "home";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("totalOfStudents", repositoryService.getAllStudents().size());
        model.addAttribute("totalOfTeachers", repositoryService.getAllTeachers().size());
        model.addAttribute("totalOfClassrooms", repositoryService.getAllClassrooms().size());
        model.addAttribute("dataForPieChart", repositoryService.getDataForPieChart());
        model.addAttribute("dataForBarChart", repositoryService.getDataForBarChart());
        return "dashboard";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        return "news";
    }
    
    @GetMapping("/calender")
    public String getCalenderPage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("classrooms", repositoryService.getAllClassrooms());
        return "calender";
    }

    @GetMapping("/exam")
    public String getExamPage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        return "exam";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        return "contact";
    }

}
