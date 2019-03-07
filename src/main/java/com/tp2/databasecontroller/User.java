package com.tp2.databasecontroller;

import com.tp2.exceptions.InvalidPassword;

import java.sql.*;
import java.util.ArrayList;

public class User {

    private String userName;
    private String userPassword;
    private Integer userId;
    private ArrayList<List> userLists;
    private boolean validPassword = false;

    //Class getters/setteurs for db

    /**
     * Remove the current user from the database
     */
    public void removeUser() throws SQLException {

    }

    /**
     * Create a new user inside the database
     */
    public void createUser() {

    }

    /**
     * Update the current info of the user inside the
     * database.
     */
    public void updateUser() {

    }

    /**
     * Check if the user inputed userPassword matches with the one in the db
     * @return If it returns true, the userPassword is valid for the userName.
     */
    public boolean testPassword() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "SELECT user.password FROM user WHERE username = ?");

        stat.setString(1, this.getUserName());
        stat.execute();

        ResultSet response = stat.getResultSet();

        if (!response.next())
            return false;

        if (!response.getString("password").equals(this.getUserPassword()))
            throw new InvalidPassword();

        this.validPassword = true;
        return true;
    }

    /**
     * This function updates the userPassword in the database. Performs a testPassword before updating it.
     */
    public void updatePassword() throws SQLException {

        if (!this.validPassword)
            throw new InvalidPassword();

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "UPDATE user SET user.password = ? WHERE user.username = ?");

        stat.setString(1, this.getUserPassword());
        stat.setString(2, this.getUserName());

        int l = stat.executeUpdate();

        if (l != 1)
            throw new RuntimeException("Cannot Modify password");

        System.out.println("Password has been modified!");
    }

    //Class getteurs/setteurs

    public User(String username, String password) {
        this.userName = username;
        this.userPassword = password;
    }

    public ArrayList<List> getUserLists() { return userLists; }

    public void addUserList(List l) { this.userLists.add(l); }

    public User(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}
