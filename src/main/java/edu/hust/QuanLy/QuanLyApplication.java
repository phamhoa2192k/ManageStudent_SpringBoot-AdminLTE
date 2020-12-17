package edu.hust.QuanLy;

/*
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.entities.User;
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import edu.hust.QuanLy.repositories.ClassroomRepository;
import edu.hust.QuanLy.repositories.StudentRepository;
import edu.hust.QuanLy.repositories.TeacherRepository;
import edu.hust.QuanLy.repositories.UserRepository;

@SpringBootApplication
public class QuanLyApplication implements CommandLineRunner {
	@Autowired StudentRepository studentRepository;
	@Autowired ClassroomRepository classroomRepository;
	@Autowired UserRepository userRepository;
	@Autowired TeacherRepository teacherRepository;
	public static void main(String[] args) {
		SpringApplication.run(QuanLyApplication.class, args);
	}

	@Override
	public void run(String...arg) throws Exception{
		/*
		User u1 = new User("admin1@gmail.com", "1");

		List<Student> students = new ArrayList<>();
		List<Classroom> classrooms = new ArrayList<>();
		List<Teacher> teachers = new ArrayList<>();

		Student s1 = new Student("pham", "a 1", "a", new Date(2000, 9, 21), "a1@gmail.com", "0987654321");
		Student s2 = new Student("pham", "a 2", "a", new Date(2000, 9, 21), "a2@gmail.com", "0987654321");
		Student s3 = new Student("pham", "a 3", "a", new Date(2000, 9, 21), "a3@gmail.com", "0987654321");
		Student s4 = new Student("pham", "a 4", "a", new Date(2000, 9, 21), "a4@gmail.com", "0987654321");
		Student s5 = new Student("pham", "a 5", "a", new Date(2000, 9, 21), "a5@gmail.com", "0987654321");
		
		Classroom c1 = new Classroom("Mất gốc 1", "a", "b", 50, 2000000);
		Classroom c2 = new Classroom("Mất gốc 2", "a", "b", 50, 2000000);
		Classroom c3 = new Classroom("TOEIC 1", "a", "b", 50, 2000000);
		Classroom c4 = new Classroom("TOEIC 2", "a", "b", 50, 2000000);
		Classroom c5 = new Classroom("Luyện thi 1", "a", "b", 50, 2000000);

		Teacher t1 = new Teacher("nguyen", "b 1", "a", new Date(1990, 1, 1), "b1@gmail.com", "0123456789");
		Teacher t2 = new Teacher("nguyen", "b 2", "a", new Date(1990, 1, 1), "b2@gmail.com", "0123456789");
		Teacher t3 = new Teacher("nguyen", "b 3", "a", new Date(1990, 1, 1), "b3@gmail.com", "0123456789");
		Teacher t4 = new Teacher("nguyen", "b 4", "a", new Date(1990, 1, 1), "b4@gmail.com", "0123456789");
		Teacher t5 = new Teacher("nguyen", "b 5", "a", new Date(1990, 1, 1), "b5@gmail.com", "0123456789");

		s1.getClassrooms().add(c1);
		s2.getClassrooms().add(c1);
		s3.getClassrooms().add(c1);
		s4.getClassrooms().add(c1);
		s5.getClassrooms().add(c1);

		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);
		c1.getStudents().add(s5);

		t1.getClassrooms().add(c1);
		t2.getClassrooms().add(c2);
		t3.getClassrooms().add(c3);
		t4.getClassrooms().add(c4);
		t5.getClassrooms().add(c5);

		c1.getTeachers().add(t1);
		c2.getTeachers().add(t2);
		c3.getTeachers().add(t3);
		c4.getTeachers().add(t4);
		c5.getTeachers().add(t5);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		classrooms.add(c1);
		classrooms.add(c2);
		classrooms.add(c3);
		classrooms.add(c4);
		classrooms.add(c5);

		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		teachers.add(t4);
		teachers.add(t5);

		userRepository.save(u1);
		studentRepository.saveAll(students);
		classroomRepository.saveAll(classrooms);
		teacherRepository.saveAll(teachers);
		*/
	}


}
