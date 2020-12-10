package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public Boolean checkLoginForm(String email,String password);
}
