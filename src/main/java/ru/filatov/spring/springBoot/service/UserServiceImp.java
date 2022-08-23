package ru.filatov.spring.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.filatov.spring.springBoot.dao.UserDao;
import ru.filatov.spring.springBoot.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }

    @Override
    public User showUserInfo(int id) {
        return userDao.showUserInfo(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUserInfo(int id, User user) {userDao.updateUserInfo(id, user);}
}
