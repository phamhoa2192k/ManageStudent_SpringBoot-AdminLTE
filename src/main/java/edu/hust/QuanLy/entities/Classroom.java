package edu.hust.QuanLy.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "classroom")
public class Classroom implements Serializable {

    @Id
    @Column(name = "id" , length = 10)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "time")
    private String time;

    @Column(name = "maxstudent")
    private int maxStudent;

    @Column(name = "tuition")
    private int tuition;
}
