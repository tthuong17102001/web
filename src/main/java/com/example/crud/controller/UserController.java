package com.example.crud.controller;

import com.example.crud.entity.User;
import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        return userService.update(id,user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
    @GetMapping("/{id}")
    public User findByID(@PathVariable Long id){
        return userService.finById(id);
    }
    @GetMapping
    public Iterable<User> findAll(){
        return userService.findAll();
    }
}
