package client;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    JFrame frame = new JFrame();
    JLabel title1 = new JLabel("Enter your name: ");
    JTextField input = new JTextField();

    JLabel title2 = new JLabel("Enter your name: ");
    // read-only text field
    JTextField output = new JTextField();
    JButton button = new JButton("Send");

    public UserInterface() {
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 1));
        frame.setBackground(java.awt.Color.white);
        frame.add(title1);
        frame.add(input);
        frame.add(title2);
        frame.add(output);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
