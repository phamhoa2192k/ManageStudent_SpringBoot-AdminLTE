package edu.hust.QuanLy.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hust.QuanLy.entities.User;
import edu.hust.QuanLy.repositories.UserRepository;
import edu.hust.QuanLy.services.LoginService;

@Service
public class LoginServiceImp implements LoginService{
    @Autowired private UserRepository userRepository;

    @Override
    public Boolean checkLoginForm(String email, String password){
        User u = userRepository.findUserByEmailAndPassword(email, password);
        if(u == null){
            return false;
        }
        else
            return true;
    }
}
