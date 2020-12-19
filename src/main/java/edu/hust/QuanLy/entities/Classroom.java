package edu.hust.QuanLy.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import javax.persistence.ConstraintMode;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = { CascadeType.MERGE,
                            CascadeType.PERSIST,
                            CascadeType.REFRESH,
                            CascadeType.DETACH 
                        })
    @JoinTable( name = "classroom_student",
                joinColumns = { @JoinColumn(name = "id_classroom") },
                inverseJoinColumns = { @JoinColumn(name = "id_student"),},
                foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
                inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT)
        )
    private Set<Student> students = new HashSet<>();



    @ManyToMany(fetch = FetchType.LAZY,
                cascade = { CascadeType.MERGE,
                            CascadeType.PERSIST,
                            CascadeType.REFRESH,
                            CascadeType.DETACH
                        })
    @JoinTable( name = "classroom_teacher",
                joinColumns = { @JoinColumn(name = "id_classroom") },
                inverseJoinColumns = { @JoinColumn(name = "id_teacher")},
                foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT),
                inverseForeignKey = @ForeignKey(ConstraintMode.CONSTRAINT)
            )
    private Set<Teacher> teachers = new HashSet<>();


    public Classroom(String name, String address, String time, int maxStudent, int tuition) {
        this.name = name;
        this.address = address;
        this.time = time;
        this.maxStudent = maxStudent;
        this.tuition = tuition;
    }

    public Classroom() {
    }

}
