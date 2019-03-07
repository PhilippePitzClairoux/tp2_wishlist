package com.tp2.databasecontroller;

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
    public void removeUser() {

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
    public boolean testPassword() {

        return true;
    }

    /**
     * This function updates the userPassword in the database. Performs a testPassword before updating it.
     */
    public void updatePassword() {

        if (!this.testPassword())
            return;
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
