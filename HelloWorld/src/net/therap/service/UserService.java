package net.therap.service;

import net.therap.domain.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: sazzadur
 * @since: 10/3/12 3:23 PM
 */
public interface UserService {

    public void saveUser(User user);

    public User verifyUser(User user);
}
