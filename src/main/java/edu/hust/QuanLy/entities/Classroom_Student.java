package edu.hust.QuanLy.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "classrom_student")
public class Classroom_Student implements Serializable {
    @Id
    @Column(name = "id", length = 10)
    private String id;

    @JoinColumn(name = "id_classroom")
    @OneToOne
    private Classroom idClassroom;

    @JoinColumn(name = "id_student")
    @OneToOne
    private Student idStudent;
    
}
