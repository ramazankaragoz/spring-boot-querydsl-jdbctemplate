package com.example.springboot.querydsl.jdbctemplate.controller;


import com.example.springboot.querydsl.jdbctemplate.dto.UserDTO;
import com.example.springboot.querydsl.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Ramazan Karagöz
 * @date 9/12/2019
 */

@RestController
@RequestMapping(value = "user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.save(userDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<List<UserDTO>> findAll(){
        return new ResponseEntity<>(userService.findAll(),HttpStatus.OK);
    }
}
