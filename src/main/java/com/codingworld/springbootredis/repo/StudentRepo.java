package com.codingworld.springbootredis.repo;

import com.codingworld.springbootredis.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}

