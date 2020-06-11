package com.example.interviewbitclone.repository;


import com.example.interviewbitclone.models.User;

import java.util.Optional;
import java.util.UUID;

public interface  UserRepository {
    public User createUser(User user);

    Optional<User> getUserBId(UUID id);
}
