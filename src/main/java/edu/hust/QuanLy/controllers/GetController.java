package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.services.CurrentUserService;

@Controller
@RequestMapping("/")
public class GetController{
    @Autowired
    private CurrentUserService currentUserService;

    @GetMapping({"/","/login"})
    public String getloginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public String logged(){
        return "/logged";
    }

    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "homepage";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "dashboard";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "news";
    }
    
    @GetMapping("/calender")
    public String getCalenderPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "calender";
    }

    @GetMapping("/book")
    public String getBookPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "book";
    }

    @GetMapping("/exam")
    public String getExamPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "exam";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "contact";
    }

    @GetMapping(value="/form_student")
    public String getStudentForm(Model model) {
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "form_student";
    }

    @GetMapping(value="/form_teacher")
    public String getTeacherForm(Model model) {
        model.addAttribute("emailOfUser", currentUserService.getCurrentUser());
        return "form_teacher";
    }
    
}