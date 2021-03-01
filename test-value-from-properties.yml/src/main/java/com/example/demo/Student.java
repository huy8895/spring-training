package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    String name;

    @Value("${student.age}")
    String age;
}
