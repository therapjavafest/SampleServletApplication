package net.therap.domain;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: sazzadur
 * @since: 10/2/12 4:29 PM
 */
public class User {
    private long userId;
    private String userName;
    private String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
