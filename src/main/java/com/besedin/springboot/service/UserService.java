package com.besedin.springboot.service;


import com.besedin.springboot.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}
