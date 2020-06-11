package com.example.interviewbitclone.services;

import com.example.interviewbitclone.models.User;
import com.example.interviewbitclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    public UserRepository userRepository;

    @Autowired

    UserService (@Qualifier("postgres") UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){

        return userRepository.createUser(user);
    }

    public User getUser(UUID id) {
        Optional<User> foundUser = userRepository.getUserBId(id);
        if(foundUser.isEmpty()){
            return null;
        }

        return foundUser.get();
    }
}
