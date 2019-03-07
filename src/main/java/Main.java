import com.tp2.LoginPageFactory;
import com.tp2.databasecontroller.ConnectionManager;
import com.tp2.databasecontroller.User;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {

//        JFrame frame = new JFrame();
//
//        frame.setContentPane(LoginPageFactory.CreateLoginPage());
//        frame.setSize(1000, 900);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
        ConnectionManager.initConnection("src/main/resources/database.properties");

        User newUser = new User("test", "olo123");

        newUser.createUser();
        newUser.testPassword();
        newUser.setUserPassword("hehe!");
        newUser.updatePassword();
        newUser.removeUser();


    }



}
