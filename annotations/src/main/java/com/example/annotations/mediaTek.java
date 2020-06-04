package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class mediaTek implements MobileProcessor{

    @Override
    public void process() {
        System.out.println("second best cpu");
    }
}
