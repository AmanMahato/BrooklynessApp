package main.java.com.brooklyness.dao;

import main.java.com.brooklyness.model.User;

import java.util.List;

/**
 * @author Aman Mahato
 */
public interface UserDao {

    public void persist(User entity);
    public void update(User entity);
    public User findById(Integer id);
    public void delete(User entity);
    public User findByFirstName(String firstName);

}
