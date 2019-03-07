import com.tp2.LoginPageFactory;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setContentPane(LoginPageFactory.CreateLoginPage());
        frame.setSize(1000, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
