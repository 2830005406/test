package xyz.service;

import xyz.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void add(User user);
}
