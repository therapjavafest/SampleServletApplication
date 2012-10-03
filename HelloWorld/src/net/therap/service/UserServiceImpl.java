package net.therap.service;

import net.therap.dao.JdbcUserDaoImpl;
import net.therap.dao.UserDao;
import net.therap.domain.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: sazzadur
 * @since: 10/3/12 3:23 PM
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(){
        userDao = new JdbcUserDaoImpl();
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User verifyUser(User user) {
        User verifiedUser = userDao.getUserByUserName(user.getUserName());
        if(verifiedUser != null && verifiedUser.getPassword().equals(user.getPassword())) {
            return verifiedUser;
        }
        return null;
    }
}
