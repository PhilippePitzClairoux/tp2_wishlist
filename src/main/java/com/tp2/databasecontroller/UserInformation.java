package com.tp2.databasecontroller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInformation {

    private String username;
    private String password;
    private boolean validPassword = false;


    public UserInformation(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Check if the user inputed password matches with the one in the db
     * @return If it returns true, the password is valid for the username.
     */
    public boolean testPassword() {

        return true;
    }

    /**
     * This function updates the password in the database. Performs a testPassword before updating it.
     */
    public void updatePassword() {

        if (!this.testPassword())
            return;


    }

}
