package ru.filatov.spring.springBoot.dao;



import ru.filatov.spring.springBoot.model.User;
import java.util.List;

public interface UserDao {

    public List<User> showAllUsers();
    public User showUserInfo(int id);
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUserInfo(int id, User user);

}
