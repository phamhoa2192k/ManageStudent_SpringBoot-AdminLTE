package edu.hust.QuanLy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

}
