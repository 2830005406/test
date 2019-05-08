package xyz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.dao.UserDAO;
import xyz.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.queryAll();
    }

    @Override
    public void add(User user) {
        userDAO.insert(user);
    }
}
