package com.kairos.controller;

import com.kairos.Entity.User;
import com.kairos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("addUser")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>("User Added Successfully.", HttpStatus.OK);
    }

    @PutMapping("updateUser")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return new ResponseEntity<>("User Updated Successfully.", HttpStatus.OK);
    }

    @GetMapping("getUser")
    public ResponseEntity<User> getUser(@RequestParam Long id) {
        User user;
        user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("getUsers")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users;
        users = userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted Successfully.", HttpStatus.OK);
    }
}
