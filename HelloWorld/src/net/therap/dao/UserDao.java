package net.therap.dao;

import net.therap.domain.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: sazzadur
 * @since: 10/3/12 1:21 PM
 */
public interface UserDao {

    public void saveUser(User user);

    public User getUserByUserName(String userName);
}
