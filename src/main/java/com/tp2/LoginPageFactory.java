package com.tp2;

import com.tp2.databasecontroller.ConnectionManager;
import com.tp2.databasecontroller.User;
import com.tp2.exceptions.InvalidPassword;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

public class LoginPageFactory {

    public static JPanel CreateLoginPage() {

        JPanel loginPage = null;

        try {

            loginPage = new JPanel(new GridBagLayout());
            ConnectionManager.initConnection("src/main/resources/database.properties");
            GridBagConstraints c = new GridBagConstraints();

            loginPage.setSize(300, 300);

            c.fill = GridBagConstraints.HORIZONTAL;

            final JLabel ltitle = new JLabel("Login Info");
            final JLabel lusername = new JLabel("Username");
            final JLabel lpassword = new JLabel("Password");
            final JLabel lerror = new JLabel("");
            final JTextField getUsername = new JTextField();
            final JPasswordField getPassword = new JPasswordField();


            JButton loginButton = new JButton("Login");
            JButton createAccountButton = new JButton("Create Account");


            addComponenet(3, 0, 60, c);
            loginPage.add(ltitle, c);

            addComponenet(0, 1, 40, c);
            loginPage.add(lusername, c);

            addComponenet(0, 2, 0, c);
            getUsername.setSize(13,5);
            loginPage.add(getUsername, c);

            addComponenet(0, 4, 40, c);
            loginPage.add(lpassword, c);

            addComponenet(0, 5, 0, c);
            loginPage.add(getPassword, c);

            addComponenet(0, 6, 0, c);
            lerror.setVisible(false);
            loginPage.add(lerror, c);

            addComponenet(3, 7, 0, c);
            c.insets = new Insets(60, 0, 0, 0);
            loginPage.add(loginButton, c);

            addComponenet(3, 8, 0, c);
            c.insets = new Insets(0, 0, 0, 0);
            loginPage.add(createAccountButton, c);


            loginPage.setBackground(Color.GRAY);

            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Login")) {

                        User currentUser =  new User(
                                getUsername.getText(),
                                String.valueOf(getPassword.getPassword()));
                        try {
                            currentUser.testPassword();
                            lerror.setText("");
                        } catch (SQLException ignored) {

                        } catch (InvalidPassword e2) {
                            lerror.setText("Invalid password");
                            lerror.setVisible(true);

                        }
                    }

                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

        return loginPage;
    }

    private static void addComponenet(int gridx, int gridy, int padding, GridBagConstraints c) {

        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = padding;
        c.ipadx = padding;
        c.gridx = gridx;
        c.gridy = gridy;
    }
}
