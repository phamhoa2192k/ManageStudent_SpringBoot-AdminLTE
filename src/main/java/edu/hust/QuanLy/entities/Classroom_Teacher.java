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
@Table(name = "classroom_teacher")
public class Classroom_Teacher {
    @Id
    @Column(name = "id",length = 10)
    private String id;

    @OneToOne(targetEntity = Classroom.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_classroom",referencedColumnName = "id")
    private Classroom classes;

    @OneToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher" , referencedColumnName = "id")
    private Teacher teacher;
}
