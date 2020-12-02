//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;

    Login() {
        super("Login Page");
        this.l1 = new JLabel("WELCOME TO BMS");
        this.l1.setFont(new Font("Osward", 1, 38));
        this.l2 = new JLabel("Card No:");
        this.l2.setFont(new Font("Raleway", 1, 28));
        this.l3 = new JLabel("PIN:");
        this.l3.setFont(new Font("Raleway", 1, 28));
        this.tf1 = new JTextField(15);
        this.pf2 = new JPasswordField(15);
        this.b1 = new JButton("SIGN IN");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("CLEAR");
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b3 = new JButton("SIGN UP");
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(175, 50, 450, 200);
        this.add(this.l1);
        this.l2.setBounds(125, 150, 375, 200);
        this.add(this.l2);
        this.tf1.setBounds(300, 235, 230, 30);
        this.add(this.tf1);
        this.l3.setBounds(125, 225, 375, 200);
        this.add(this.l3);
        this.tf1.setFont(new Font("Arial", 1, 14));
        this.pf2.setFont(new Font("Arial", 1, 14));
        this.pf2.setBounds(300, 310, 230, 30);
        this.add(this.pf2);
        this.b1.setFont(new Font("Arial", 1, 14));
        this.b1.setBounds(300, 400, 100, 30);
        this.add(this.b1);
        this.b2.setFont(new Font("Arial", 1, 14));
        this.b2.setBounds(430, 400, 100, 30);
        this.add(this.b2);
        this.b3.setFont(new Font("Arial", 1, 14));
        this.b3.setBounds(300, 450, 230, 30);
        this.add(this.b3);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(750, 750);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn c1 = new conn();
            String a = this.tf1.getText();
            String b = this.pf2.getText();
            String q = "select * from login where cardno = '" + a + "' and pin = '" + b + "'";
            ResultSet rs = c1.s.executeQuery(q);
            if (ae.getSource() == this.b1) {
                if (rs.next()) {
                    (new Transcations()).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect Card Number or Password");
                }
            } else if (ae.getSource() == this.b2) {
                this.tf1.setText("");
                this.pf2.setText("");
            } else if (ae.getSource() == this.b3) {
                (new Signup()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            System.out.println("error: " + var7);
        }

    }

    public static void main(String[] args) {
        (new Login()).setVisible(true);
    }
}
