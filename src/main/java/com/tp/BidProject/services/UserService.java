package com.tp.BidProject.services;

import com.tp.BidProject.entities.User;
import com.tp.BidProject.repositories.UserDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    UserDAOInterface userDAO;
    @Override
    public User getUserByid(Integer id) {
        return userDAO.getUserById(id);
    }

    @Override
    public User getUserByemail(String email) {
        return userDAO.getUserBydEmail(email);
    }

    @Override
    public boolean insertUser(User user) {
        return userDAO.InsertUser(user);
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    public boolean updateUser(Integer id, User user) {
        return userDAO.updateUser(id,user);
    }
}
