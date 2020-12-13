package edu.hust.QuanLy.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "classroom_teacher")
public class Classroom_Teacher implements Serializable {
    @Id
    @Column(name = "id", length = 10)
    private String id;
    
    @JoinColumn(name = "id_classroom")
    @OneToOne
    private Classroom idClassroom;

    @JoinColumn(name = "id_student")
    @OneToOne
    private Teacher idTeacher;
}
