package edu.hust.QuanLy.services;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    /**
     * Phương thức kiểm tra thông tin đăng nhập của người dùng
     * @param email
     * @param password
     */
    public Boolean checkLoginForm(String email,String password);
}
