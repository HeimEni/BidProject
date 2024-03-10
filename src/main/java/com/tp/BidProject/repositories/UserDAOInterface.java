package com.tp.BidProject.repositories;

import com.tp.BidProject.entities.User;

import java.util.List;

public interface UserDAOInterface {
    User getUserById(Integer id);
    User getUserBydEmail(String email);
    List<User> getAll();
    boolean InsertUser(User user);
    boolean updateUser(Integer id, User user);

}
