package main.java.com.brooklyness.services;

import main.java.com.brooklyness.model.User;

/**
 * @author Aman Mahato
 */
public interface UserService {

    public void addUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
    public User findUserByFirstName(String firstName);
    public User findUserById(Integer id);
}
