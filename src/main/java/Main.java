
import com.tp2.databasecontroller.ConnectionManager;
import com.tp2.databasecontroller.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            ConnectionManager.initConnection("src/main/resources/database.properties");

            User currentUser = new User("Pitz", "");

            currentUser.setUserPassword("pass123");
            currentUser.testPassword();

            currentUser.setUserPassword("pass123");
            currentUser.updatePassword();

            System.out.println("Check if password is valid (it is) : " + currentUser.testPassword());

            JFrame frame = new JFrame("Login Page");

            JPanel pane = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            pane.setSize(300, 300);

            c.fill = GridBagConstraints.HORIZONTAL;

            final JLabel ltitle = new JLabel("Login Info");
            final JLabel lusername = new JLabel("Username");
            final JLabel lpassword = new JLabel("Password");
            final JTextArea getUsername = new JTextArea(currentUser.getUserName());
            final JPasswordField getPassword = new JPasswordField(currentUser.getUserPassword());

            JButton editButton = new JButton("Login");
            JButton createAccountButton = new JButton("Create Account");


            addComponenet(3, 0, 60, c);
            pane.add(ltitle, c);

            addComponenet(0, 1, 40, c);
            pane.add(lusername, c);

            addComponenet(0, 2, 0, c);
            getUsername.setColumns(13);
            pane.add(getUsername, c);

            addComponenet(0, 4, 40, c);
            pane.add(lpassword, c);

            addComponenet(0, 5, 0, c);
            pane.add(getPassword, c);

            addComponenet(3, 6, 0, c);
            c.insets = new Insets(60, 0, 0, 0);
            pane.add(editButton, c);

            addComponenet(3, 7, 0, c);
            c.insets = new Insets(0, 0, 0, 0);
            pane.add(createAccountButton, c);


            pane.setBackground(Color.GRAY);
            frame.setBackground(Color.WHITE);

            frame.setContentPane(pane);
            frame.setSize(1000, 900);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addComponenet(int gridx, int gridy, int padding, GridBagConstraints c) {

        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = padding;
        c.ipadx = padding;
        c.gridx = gridx;
        c.gridy = gridy;
    }

}
