package com.tp.BidProject.services;

import com.tp.BidProject.entities.User;

import java.util.List;

public interface UserServiceInterface {
    User getUserByid(Integer id);
    User getUserByemail(String email);
    boolean insertUser(User user);
    List<User> getAll();
    boolean updateUser(Integer id, User user);

}
