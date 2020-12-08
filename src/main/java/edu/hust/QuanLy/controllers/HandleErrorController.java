package edu.hust.QuanLy.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandleErrorController implements ErrorController{
    @RequestMapping("/fsdà")
    public String handleError(HttpServletRequest request) {
      Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
      if (status != null) {
        Integer statusCode = Integer.valueOf(status.toString());
        if (statusCode == HttpStatus.NOT_FOUND.value()) {
          return "404";
        } 
        else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
          return "500";
        }
      }
      return "error";
    }

    
    @Override
    public String getErrorPath(){
        return "sđầ";
    }
}