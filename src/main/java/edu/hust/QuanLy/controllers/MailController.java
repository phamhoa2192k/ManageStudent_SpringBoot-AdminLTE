package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import edu.hust.QuanLy.services.InfomationForGUIService;


@Controller
@RequestMapping(value = "/mail")
public class MailController {
    @Autowired private InfomationForGUIService infomationForGUIService;
    @GetMapping(value="/inbox")
    public String getInbox(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "mailbox";
    }

    @GetMapping(value="/compose")
    public String getCompose(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "compose";
    }

    @GetMapping(value="/read")
    public String getRead(Model model) {
        model.addAttribute("emailOfUser", infomationForGUIService.getEmailOfCurrentUser());
        return "readmail";
    }
    
}
