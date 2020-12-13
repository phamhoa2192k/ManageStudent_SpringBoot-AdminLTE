package edu.hust.QuanLy.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "id" , length = 10)
    private String id;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;

}
