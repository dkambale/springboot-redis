package com.codingworld.springbootredis.controller;

import com.codingworld.springbootredis.entity.Student;
import com.codingworld.springbootredis.repo.StudentRepo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class StudentController {

  @Autowired
  StudentRepo studentRepo;

  @GetMapping("/getallstudent")
  public List<Student> getAllStudent() {
    List<Student> actualList = new ArrayList<>();
    studentRepo.findAll().iterator().forEachRemaining(actualList::add);
    return  actualList;
  }

  @PostMapping("/saveStudent")
  public Student saveStudentData( @RequestBody Student student) {

    studentRepo.save(student);
    return student;
  }

  @DeleteMapping("/deleteStudent")
  public void deleteStudent( @PathParam("id") Integer id) {
    studentRepo.deleteById(id);
  }

  @PostConstruct
  public void saveStudent() {
    Student student=new Student();
    student.setId(1);
    student.setName("Nilesh");
    studentRepo.save(student);
  }
}
