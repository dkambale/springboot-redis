package com.codingworld.springbootredis.service;

import com.codingworld.springbootredis.entity.Student;
import com.codingworld.springbootredis.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  StudentRepo studentRepo;

  @Cacheable(value = "studentCache")
  public Student getStudentById(Integer id) {
    System.out.println("Calling repo for student");
    return studentRepo.findById(id).orElse(null
    );
  }

}
