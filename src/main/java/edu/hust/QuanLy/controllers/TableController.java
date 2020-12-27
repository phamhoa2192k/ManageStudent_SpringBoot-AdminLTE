package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.hust.QuanLy.entities.Classroom;
import edu.hust.QuanLy.entities.Student;
import edu.hust.QuanLy.entities.Teacher;
import edu.hust.QuanLy.services.EditService;
import edu.hust.QuanLy.services.RepositoryService;

@Controller
@RequestMapping("/table")
public class TableController {
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private EditService editService;

    // STUDENT
    @GetMapping(value = "/student")
    public String getStudentTablePage(Model model) {
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("listStudents", repositoryService.getAllStudents());
        model.addAttribute("classrooms", repositoryService.getAllClassrooms());
        return "table_student";
    }

    @GetMapping(value = "/student/{id}")
    public String getStudentTablePage(@PathVariable("id") long id, Model model) {
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("student", repositoryService.findStudentById(id));
        model.addAttribute("classrooms", repositoryService.getAllClassrooms());
        return "student_detail";
    }

    @GetMapping(value = "/student/{id}/delete")
    public String deleteStudent(@PathVariable("id") long id, Model model) {
        editService.deleteStudent(id);
        return "redirect:/table/student";
    }

    @PostMapping(value = "/student/edit")
    public String postEditFormStudent(Student student, String list) {
        editService.editStudent(student, list);
        return "redirect:/table/student/" + student.getId();
    }

    // TEACHER
    @GetMapping(value = "/teacher")
    public String getTeacherTablePage(Model model) {
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("listTeacher", repositoryService.getAllTeachers());
        model.addAttribute("classrooms", repositoryService.getAllClassrooms());
        return "table_teacher";
    }

    @GetMapping(value = "/teacher/{id}")
    public String getTeacherTablePage(@PathVariable("id") long id,Model model) {
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("teacher", repositoryService.findTeacherById(id));
        model.addAttribute("classrooms", repositoryService.getAllClassrooms());
        return "teacher_detail";
    }

    @GetMapping(value = "/teacher/{id}/delete")
    public String deleteTeacher(@PathVariable("id") long id) {
        editService.deleteTeacher(id);
        return "redirect:/table/teacher";
    }

    @PostMapping(value = "/teacher/edit")
    public String postEditFormTeacher(Teacher teacher, String list, Model model) {
        editService.editTeacher(teacher, list);
        return "redirect:/table/teacher";
    }


    // CLASSROOM
    @GetMapping(value = "/classroom")
    public String getClassroomTablePage(Model model) {
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("listClassrooms", repositoryService.getAllClassrooms());
        return "table_classroom";
    }

    @GetMapping(value = "/classroom/{id}")
    public String getMethodName(@PathVariable("id") long id, Model model) {
        Classroom c = repositoryService.findClassroomById(id);
        model.addAttribute("emailOfUser", repositoryService.getEmailOfCurrentUser());
        model.addAttribute("classroom", c);
        model.addAttribute("students", c.getStudents());
        model.addAttribute("teachers", c.getTeachers());
        return "classroom_detail";
    }

    @PostMapping(value = "/classroom/edit")
    public String editClassroom(Classroom classroom) {
        editService.editClassroom(classroom);
        return "redirect:/table/classroom/"+ classroom.getId();
    }

    @PostMapping(value = "/classroom/delete")
    public String postDeleteFormClassroom(@RequestParam long id) {
        editService.deleteClassroom(id);
        return "redirect:/table/classroom";
    }

    @GetMapping(value="/classroom/{idclassroom}/{idstudent}/remove-student")
    public String removeStudentFromClassroom(@PathVariable("idclassroom") long idclassroom , @PathVariable("idstudent") long idstudent) {
        editService.removeStudentFromClassroom(idstudent, idclassroom);
        return "redirect:/table/classroom/" + idclassroom;
    }

    @GetMapping(value="/classroom/{idclassroom}/{idteacher}/remove-teacher")
    public String removeTeacherFromClassroom(@PathVariable("idclassroom") long idclassroom , @PathVariable("idteacher") long idteacher) {
        editService.removeTeacherFromClassroom(idteacher, idclassroom);
        return "redirect:/table/classroom/" + idclassroom;
    }
    

}
