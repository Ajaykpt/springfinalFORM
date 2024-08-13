package com.grouplast.grouplast.service;


import com.grouplast.grouplast.model.Student;
import com.grouplast.grouplast.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepository repo;

    public List<Student> display() {
        return repo.findAll();
    }

    public void addStud(Student stud) {
        repo.save(stud);
    }

    public Student updatestudent(Student stud) {
        return repo.save(stud);
    }

    public void  deleteStud(int id) {
         repo.deleteById(id);
    }
}
