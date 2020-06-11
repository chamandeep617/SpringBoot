package com.example.interviewbitclone.repository;

import com.example.interviewbitclone.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("inMemory")
public class UserRepositoryImpl implements  UserRepository{

    private List<User> userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user) {

        User createUSer = new User(user.getName(), user.getGender());
        userDatabase.add(createUSer);
        return createUSer;
    }

    @Override
    public Optional<User> getUserBId(UUID id) {
        Optional<User> foundUser= userDatabase.stream()
                .filter(
                    user -> user.getUuid().equals(id)
                ).findFirst();

//        if(foundUser.isEmpty()){
////            System.out.println(id);
////            System.out.println(userDatabase);
//            return null;
//        }
        return foundUser;
    }
}
