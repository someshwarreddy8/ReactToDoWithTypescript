package com.kairos.service;

import com.kairos.Entity.User;
import com.kairos.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void addUser(User user) {
        userRepo.save(user);
    }

    public void updateUser(User user) {
        User userFromDb = userRepo.findById(user.getId()).orElseThrow(() -> new RuntimeException("Unable to find user with Id: " + user.getId()));

        userRepo.save(userFromDb);
    }

    public User getUser(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("Exception occurred while getting user with id: " + id));
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
        try {
            userRepo.deleteById(id);
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred while deleting user with id: " + id);
        }
    }
}
