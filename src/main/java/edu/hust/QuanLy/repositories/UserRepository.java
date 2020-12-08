package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findUserByEmailAndPassword(String username, String password);
}
