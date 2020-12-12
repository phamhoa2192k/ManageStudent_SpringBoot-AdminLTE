package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

@Service
public interface CurrentUserService {
    public String getCurrentUser();
    public void setCurrentUser(String name);
}
