package com.example.interviewbitclone;

import com.example.interviewbitclone.models.User;
import com.example.interviewbitclone.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewbitcloneApplication.class, args);

        User user = new User("Chaman", Constants.Gender.MALE);

    }

}
