package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void save(User user);

    void delete(int id);

    void update(User user);

    User getById(int id);

    User getUserByName(String name);
}