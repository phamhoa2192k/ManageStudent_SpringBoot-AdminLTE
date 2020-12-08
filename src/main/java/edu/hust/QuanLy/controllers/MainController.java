package edu.hust.QuanLy.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.hust.QuanLy.entities.User;
import edu.hust.QuanLy.repositories.UserRepository;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class MainController{
    @Autowired
    private UserRepository userRepository;

    String email;

    @GetMapping({"/","/login"})
    public String getLoginPage(){
        return "login";
    }

    @PostMapping(value="/login")
    public String checkLogIn(@RequestParam String email, @RequestParam String password, Model model) {
        User u = userRepository.findUserByEmailAndPassword(email, password);
        if(u == null){
            model.addAttribute("warn", "Email or password not found!");
            return  "login";
        }
        else{
            this.email = email;
           // model.addAttribute("email", this.email);
            return "redirect:/dashboard";
        }
            
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("email", this.email);
        return "dashboard";
    }
    
}