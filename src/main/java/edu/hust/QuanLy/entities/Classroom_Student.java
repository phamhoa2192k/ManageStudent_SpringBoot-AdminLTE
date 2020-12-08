package edu.hust.QuanLy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "classroom_student")
public class Classroom_Student {
    
    @Id
    @Column(name = "id", length = 10)
    private String id;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = Classroom.class)
    @JoinColumn(name = "id_classroom" ,referencedColumnName = "id")
    private Classroom classroom;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = Student.class)
    @JoinColumn(name = "id_student" ,referencedColumnName = "id")
    private Student student;

}
