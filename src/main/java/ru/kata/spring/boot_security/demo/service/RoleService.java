package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    List<Role> allRoles();

    void save(Role role);

    void update(Role role);

    Role getById(int id);

    Role getByName(String roleName);

    public HashSet getRoleSet(String[] role);

}
