package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.services.InfomationForUIService;

@Controller
public class AppController {
    @Autowired private InfomationForUIService infomationForUIService;
    @GetMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "home";
    }

    @GetMapping("/dashboard")
    public String getDashboardPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "dashboard";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "news";
    }
    
    @GetMapping("/calender")
    public String getCalenderPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "calender";
    }

    @GetMapping("/book")
    public String getBookPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "book";
    }

    @GetMapping("/exam")
    public String getExamPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "exam";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model){
        model.addAttribute("emailOfUser", infomationForUIService.getEmailOfCurrentUser());
        return "contact";
    }
}
