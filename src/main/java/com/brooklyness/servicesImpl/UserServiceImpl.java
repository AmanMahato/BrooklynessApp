package main.java.com.brooklyness.servicesImpl;

import main.java.com.brooklyness.dao.UserDao;
import main.java.com.brooklyness.model.User;
import main.java.com.brooklyness.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Aman Mahato
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public User findUserByFirstName(String firstName) {
        return userDao.findByFirstName(firstName);
    }

    @Override
    @Transactional
    public User findUserById(Integer id) {
        return userDao.findById(id);
    }
}
