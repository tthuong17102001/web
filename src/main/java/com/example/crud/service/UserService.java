package com.example.crud.service;

import com.example.crud.entity.User;

public interface UserService {
    User create(User user);
    User update(Long id, User user);
    void delete(Long id);
    User finById(Long id);
    Iterable<User> findAll();
}
