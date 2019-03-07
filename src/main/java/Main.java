
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");

        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;

        final JLabel ltitle = new JLabel("Login Info");
        final JLabel lusername = new JLabel("Username");
        final JLabel lpassword = new JLabel("Password");
        final JTextArea getUsername = new JTextArea("root");
        final JTextArea getPassword = new JTextArea("");

        JButton editButton = new JButton("Login");
        JButton createAccountButton = new JButton("Create Account");


        addComponenet(3, 0, 60, c);
        pane.add(ltitle, c);

        addComponenet(0, 1, 40, c);
        pane.add(lusername, c);

        addComponenet(0, 2, 0, c);
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

        frame.setContentPane(pane);
        frame.setSize(1000, 900);
        frame.setVisible(true);
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
