package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.hust.QuanLy.services.LoginService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class MainController{
    private String emailOfUser;
    @Autowired
    private LoginService loginService;
    @GetMapping({"/","/login"})
    public String getloginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String postLoginForm(@RequestParam String email, @RequestParam String password, Model model) {
        if(!loginService.checkLoginForm(email, password)){
            model.addAttribute("warn", "Email or password not found!");
            return  "login";
        }
        else{
            this.emailOfUser = email;
            return "redirect:/home";
        }
            
    }
    @GetMapping("/logout")
    public String logged(){
        return "/logged";
    }

    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "homepage";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "dashboard";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "news";
    }
    
    @GetMapping("/calender")
    public String getCalenderPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "calender";
    }

    @GetMapping("/book")
    public String getBookPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "book";
    }

    @GetMapping("/exam")
    public String getExamPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "exam";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("emailOfUser", this.emailOfUser);
        return "contact";
    }
    
}