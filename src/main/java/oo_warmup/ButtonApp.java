package oo_warmup;

import javax.swing.*;
import java.awt.*;

public class ButtonApp {

    public static void main(String args[]){
        JFrame frame = new JFrame("Button Demo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Add two buttons to our pane
        JButton button1 = new JButton("Say hello");
        JButton button2 = new JButton("Say goodbye");

        // Adjust the style of button1
        button1.setBackground(Color.green);
        button1.setBorderPainted(false);
        button1.setOpaque(true);

        // Disable button2
        button2.setEnabled(false);

        // Handle button1 click
        button1.addActionListener(e -> {
            System.out.println("hello");
            button2.setEnabled(true);
        });

        // Handle button2 click
        button2.addActionListener(e ->System.out.println("goodbye") );

        // Add buttons to frame and make visible
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
    }
}