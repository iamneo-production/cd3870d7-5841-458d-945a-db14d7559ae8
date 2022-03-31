package com.examly.springapp.controller;


import com.examly.springapp.model.Role;
import com.examly.springapp.model.User;
import com.examly.springapp.model.UserRole;
import com.examly.springapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value={"/user","/admin"})
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   
    @PostMapping("/signup")
    public User createUser(@RequestBody User user) throws Exception {

        // encoding password
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleName(user.getUserRole());
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        //set function add
        roles.add(userRole);
        return this.userService.addUser(user,roles);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(this.userService.getUsers());
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody  User user){
        return this.userService.updateUser(user);
    }
}
