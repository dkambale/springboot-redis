package com.codingworld.springbootredis.entity;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Student")
public class Student  implements Serializable {

  Integer id;
  String name;

}
