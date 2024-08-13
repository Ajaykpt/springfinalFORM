package com.grouplast.grouplast.controller;


import com.grouplast.grouplast.model.Student;
import com.grouplast.grouplast.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> display(Student stud){
        return studentService.display();
    }

    @PostMapping("/student")
    public void addStud(@RequestBody Student stud){
        studentService.addStud(stud);
    }

    @PutMapping("/student/{id}")
    public  Student updateStudent(@RequestBody Student stud){
        return studentService.updatestudent(stud);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStud(@PathVariable int id ){
         studentService.deleteStud(id);
    }
}
