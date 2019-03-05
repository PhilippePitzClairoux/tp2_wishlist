package com.tp2.databasecontroller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    private static String username;
    private static String password;
    private static String url;

    public static void initConnection(String fileName) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(fileName);

        prop.load(fis);

        url = prop.getProperty("jdbc.url");
        username = prop.getProperty("jdbc.username");
        password = prop.getProperty("jdbc.password");

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}
