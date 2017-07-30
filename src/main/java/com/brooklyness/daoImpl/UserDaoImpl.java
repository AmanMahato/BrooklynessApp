package main.java.com.brooklyness.daoImpl;

import main.java.com.brooklyness.dao.UserDao;
import main.java.com.brooklyness.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Aman Mahato
 */

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void persist(User entity) {
        Session session=sessionFactory.getCurrentSession();
        session.persist(entity);
    }

    @Override
    public void update(User entity) {
        Session session=sessionFactory.getCurrentSession();
        session.update(entity);
    }

    @Override
    public User findById(Integer id) {
        Session session=sessionFactory.getCurrentSession();
        User user=(User) session.load(User.class,id);
        return user;
    }


    @Override
    public void delete(User entity) {
        Session session=sessionFactory.getCurrentSession();
        User userToBeDeleted=(User) session.load(User.class,entity.getId().intValue());
        if(userToBeDeleted!=null) session.delete(userToBeDeleted);
    }

    @Override
    public User findByFirstName(String firstName) {
        Session session=sessionFactory.getCurrentSession();
        User user=(User) session.load(User.class,firstName);
        return user;
    }
}