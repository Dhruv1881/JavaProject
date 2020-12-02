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

public class Withdrawl extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4;

    Withdrawl() {
        
        super("Withdrawl");
        this.l1 = new JLabel("MAXIMUM DAILY WITHDRAWAL");
        this.l1.setFont(new Font("System", 1, 40));
        this.l2 = new JLabel("IS RS.10,000");
        this.l2.setFont(new Font("System", 1, 40));
        this.l3 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        this.l3.setFont(new Font("System", 1, 35));
        this.l4 = new JLabel("Enter Pin");
        this.l4.setFont(new Font("System", 1, 14));
        this.t1 = new JTextField();
        this.t1.setFont(new Font("Raleway", 1, 22));
        this.t2 = new JTextField();
        this.t2.setFont(new Font("Raleway", 1, 14));
        this.b1 = new JButton("WITHDRAW");
        this.b1.setFont(new Font("System", 1, 18));
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("BACK");
        this.b2.setFont(new Font("System", 1, 18));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b3 = new JButton("EXIT");
        this.b3.setFont(new Font("System", 1, 18));
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.l4.setBounds(620, 10, 80, 30);
        this.add(this.l4);
        this.t2.setBounds(700, 10, 40, 30);
        this.add(this.t2);
        this.l1.setBounds(90, 100, 800, 60);
        this.add(this.l1);
        this.l2.setBounds(270, 160, 800, 60);
        this.add(this.l2);
        this.l3.setBounds(120, 260, 800, 60);
        this.add(this.l3);
        this.t1.setBounds(210, 340, 360, 50);
        this.add(this.t1);
        this.b1.setBounds(220, 400, 160, 50);
        this.add(this.b1);
        this.b2.setBounds(400, 400, 160, 50);
        this.add(this.b2);
        this.b3.setBounds(300, 550, 200, 50);
        this.add(this.b3);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(800, 800);
        setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String a = this.t1.getText();
            String b = this.t2.getText();
            if (ae.getSource() == this.b1) {
                if (this.t1.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Please enter the Amount to you want to Withdraw");
                } else {
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '" + b + "' ");
                    double balance = 0.0D;
                    if (rs.next()) {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");
                        double d = Double.parseDouble(a);
                        balance -= d;
                        String q1 = "insert into bank values('" + pin + "',null,'" + d + "','" + balance + "')";
                        c1.s.executeUpdate(q1);
                    }

                    JOptionPane.showMessageDialog((Component)null, "Rs. " + a + " Debited Successfully");
                    (new Transcations()).setVisible(true);
                    this.setVisible(false);
                }
            } else if (ae.getSource() == this.b2) {
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b3) {
                System.exit(0);
            }
        } catch (Exception var12) {
            var12.printStackTrace();
            System.out.println("error: " + var12);
        }

    }

    public static void main(String[] args) {
        (new Withdrawl()).setVisible(true);
    }
}
