package edu.hust.QuanLy.servicesImp;

import org.springframework.stereotype.Service;

import edu.hust.QuanLy.services.CurrentUserService;

@Service
public class CurrentUserServiceImp implements CurrentUserService {
    private String currentUser;

    @Override
    public String getCurrentUser(){
        return this.currentUser;
    }

    @Override
    public void setCurrentUser(String name){
        this.currentUser = name;
    }
}
