package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("Worlds best cpu");
    }
}
