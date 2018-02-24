package chhaichivon.com.androidjavamvp;

import java.util.Date;

/**
 * Created by chhaichivon on 2/10/18.
 */

public class User {

    private String username;
    private String email;
    private Date createDate;

    public User(String username, String email, Date createDate) {
        this.username = username;
        this.email = email;
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
