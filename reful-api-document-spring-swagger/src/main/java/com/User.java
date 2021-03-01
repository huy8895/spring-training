package com;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private final String name;
    private final String age;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        User huy = User.builder().age("12").name("hhuy").build();
        System.out.println("hhuy = " + huy);
    }
}
