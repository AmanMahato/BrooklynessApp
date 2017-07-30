package main.java.com.brooklyness.dto;

/**
 * @author Aman Mahato
 */
public class UserLoginDTO {

    private String userName;
    private String password;
    private Integer userID;

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

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
