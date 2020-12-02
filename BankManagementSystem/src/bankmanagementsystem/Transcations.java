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

public class Transcations extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;

    Transcations() {
        super("Main Menu");
        this.l1 = new JLabel("Please Select Your Transaction");
        this.l1.setFont(new Font("System", 1, 38));
        this.b1 = new JButton("DEPOSIT");
        this.b1.setFont(new Font("System", 1, 18));
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("CASH WITHDRAWL");
        this.b2.setFont(new Font("System", 1, 18));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b3 = new JButton("FAST CASH");
        this.b3.setFont(new Font("System", 1, 18));
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.b4 = new JButton("MINI STATEMENT");
        this.b4.setFont(new Font("System", 1, 18));
        this.b4.setBackground(Color.BLACK);
        this.b4.setForeground(Color.WHITE);
        this.b5 = new JButton("PIN CHANGE");
        this.b5.setFont(new Font("System", 1, 18));
        this.b5.setBackground(Color.BLACK);
        this.b5.setForeground(Color.WHITE);
        this.b6 = new JButton("BALANCE ENQUIRY");
        this.b6.setFont(new Font("System", 1, 18));
        this.b6.setBackground(Color.BLACK);
        this.b6.setForeground(Color.WHITE);
        this.b7 = new JButton("EXIT");
        this.b7.setFont(new Font("System", 1, 18));
        this.b7.setBackground(Color.BLACK);
        this.b7.setForeground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(100, 100, 700, 40);
        this.add(this.l1);
        this.b1.setBounds(40, 250, 300, 60);
        this.add(this.b1);
        this.b2.setBounds(440, 250, 300, 60);
        this.add(this.b2);
        this.b3.setBounds(40, 360, 300, 60);
        this.add(this.b3);
        this.b4.setBounds(440, 360, 300, 60);
        this.add(this.b4);
        this.b5.setBounds(40, 470, 300, 60);
        this.add(this.b5);
        this.b6.setBounds(440, 470, 300, 60);
        this.add(this.b6);
        this.b7.setBounds(240, 600, 300, 60);
        this.add(this.b7);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.b6.addActionListener(this);
        this.b7.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(800, 800);
        setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b1) {
            (new Deposit()).setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b2) {
            (new Withdrawl()).setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b3) {
            (new FastCash()).setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b4) {
            (new MiniStatement()).setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b5) {
            (new Pin()).setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == this.b6) {
            String pinn = JOptionPane.showInputDialog("Enter PIN");
            conn c1 = new conn();

            try {
                ResultSet rs = c1.s.executeQuery(" SELECT balance FROM bank ORDER BY pin  = '" + pinn + "' DESC LIMIT 1");
                if (rs.next()) {
                    String balance = rs.getString("balance");
                    JOptionPane.showMessageDialog((Component)null, "Your Account Balance is " + balance);
                }
            } catch (Exception var6) {
                var6.printStackTrace();
            }
        } else if (ae.getSource() == this.b7) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        (new Transcations()).setVisible(true);
    }
}
