package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.services.CurrentUserService;
import edu.hust.QuanLy.services.LoginService;
import edu.hust.QuanLy.services.RegisterService;



@Controller
@RequestMapping("/")
public class PostController {
    @Autowired private CurrentUserService currentUserService;
    @Autowired private LoginService loginService;
    @Autowired private RegisterService registerService;

    @PostMapping("/login")
    public String postLoginForm(@RequestParam String email, @RequestParam String password, Model model) {
        if(!loginService.checkLoginForm(email, password)){
            model.addAttribute("warn", "Email or password not found!");
            return  "login";
        }
        else{
            currentUserService.setCurrentUser(email);
            return "redirect:/home";
        }    
    }

    @PostMapping(value="/form_student")
    public String postStudentRegister(Student student, String list) {
        registerService.registerForStudent(student, list);
        return "register_success";
    }
    
}
