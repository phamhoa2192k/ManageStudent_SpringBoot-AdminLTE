package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.hust.QuanLy.services.RepositoryService;
import edu.hust.QuanLy.services.LoginService;

@Controller
@RequestMapping("/")
public class UserAuthentication {
    @Autowired private RepositoryService infomationForGUIService;
    @Autowired private LoginService loginService;

    @GetMapping({"/","/login"})
    public String getloginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public String logged(){
        return "redirect:/login";
    }
    

    @PostMapping("/login")
    public String postLoginForm(@RequestParam String email, @RequestParam String password, Model model) {
        if(!loginService.checkLoginForm(email, password)){
            model.addAttribute("warn", "Email or password not found!");
            return  "login";
        }
        else{
            infomationForGUIService.setEmailOfCurrentUser(email);
            return "redirect:/home";
        }    
    }
}
