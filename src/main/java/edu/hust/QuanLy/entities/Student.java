package edu.hust.QuanLy.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.ConstraintMode;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = { CascadeType.MERGE,
                            CascadeType.PERSIST,
                            CascadeType.REFRESH,
                            CascadeType.DETACH
                         })
    @JoinTable( name = "classroom_student",
                inverseJoinColumns = {@JoinColumn(name = "id_classroom")},
                joinColumns = {@JoinColumn(name = "id_student")},
                foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
                inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT)
                )
    private Set<Classroom> classrooms =  new HashSet<>();

    public Student(String firstName, String lastName, String address, Date birthday, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }

    
    
}
