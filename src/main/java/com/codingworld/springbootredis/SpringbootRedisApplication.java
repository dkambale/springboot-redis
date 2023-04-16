package com.codingworld.springbootredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.codingworld.springbootredis")
@EnableCaching
public class SpringbootRedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootRedisApplication.class, args);
  }

}
