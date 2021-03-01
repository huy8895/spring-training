package com.example.demo;

import org.springframework.stereotype.Component;

public interface Outfit {
    public void wear();
}

/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
  */
@Component
class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}

@Component
class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}
