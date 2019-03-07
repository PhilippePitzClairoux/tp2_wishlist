package com.tp2.databasecontroller;

import com.tp2.exceptions.CannotCreateUser;
import com.tp2.exceptions.CannotDeleteUser;
import com.tp2.exceptions.CouldNotUpdate;
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

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "DELETE FROM users WHERE users.username = ? AND users.id_user = ? AND users.password = ?");

        stat.setString(1, this.getUserName());
        stat.setInt(2, this.getUserId());
        stat.setString(3, this.getUserPassword());

        if (stat.executeUpdate() != 1)
            throw new CannotDeleteUser();

        conn.close();
        stat.close();
    }

    /**
     * Create a new user inside the database
     */
    public void createUser() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "INSERT INTO users(users.username, users.password) VALUES (?, ?)");

        stat.setString(1, this.getUserName());
        stat.setString(2, this.getUserPassword());

        if (stat.executeUpdate() != 1)
            throw new CannotCreateUser();

        stat.close();
        conn.close();
    }

    /**
     * Update the current info of the user inside the
     * database.
     */
    public void updateUser() throws SQLException, CouldNotUpdate {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "UPDATE users SET users.username = ?, users.password = ? WHERE users.id_user = ?");

        stat.setString(1, this.getUserName());
        stat.setString(2, this.getUserPassword());
        stat.setInt(3, this.getUserId());

        if (stat.executeUpdate() != 1)
            throw new CouldNotUpdate();

        stat.close();
        conn.close();
    }

    /**
     * Check if the user inputed userPassword matches with the one in the db
     * @return If it returns true, the userPassword is valid for the userName.
     */
    public boolean testPassword() throws SQLException {

        this.getDatabaseUserId();
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "SELECT users.password FROM users WHERE users.username = ? AND users.id_user = ?");

        stat.setString(1, this.getUserName());
        stat.setInt(2, this.getUserId());

        stat.execute();

        ResultSet response = stat.getResultSet();

        if (!response.next())
            return false;

        if (!response.getString("password").equals(this.getUserPassword()))
            throw new InvalidPassword();

        response.close();
        stat.close();
        conn.close();

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
                "UPDATE users SET users.password = ? WHERE users.username = ? AND users.id_user = ?");

        stat.setString(1, this.getUserPassword());
        stat.setString(2, this.getUserName());
        stat.setInt(3, this.getUserId());

        if (stat.executeUpdate() != 1)
            throw new RuntimeException("Cannot Modify password");

        stat.close();
        conn.close();
    }

    public void getDatabaseUserId() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "SELECT users.id_user FROM users WHERE users.username = ?");

        stat.setString(1, this.getUserName());
        ResultSet res = stat.executeQuery();

        res.next();
        this.userId = res.getInt("id_user");

        res.close();
        conn.close();
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
