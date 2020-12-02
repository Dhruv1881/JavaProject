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

public class Pin extends JFrame implements ActionListener {
    JPasswordField t1,t2,t3;
    JButton b1,b2;
    JLabel l1,l2,l3,l4;

    Pin() {
        super("Pin Change");
        this.l1 = new JLabel("CHANGE YOUR PIN");
        this.l1.setFont(new Font("System", 1, 35));
        this.l2 = new JLabel("Current PIN:");
        this.l2.setFont(new Font("System", 1, 22));
        this.l3 = new JLabel("New PIN:");
        this.l3.setFont(new Font("System", 1, 22));
        this.l4 = new JLabel("Re-Enter New PIN:");
        this.l4.setFont(new Font("System", 1, 22));
        this.t1 = new JPasswordField();
        this.t1.setFont(new Font("Raleway", 1, 22));
        this.t2 = new JPasswordField();
        this.t2.setFont(new Font("Raleway", 1, 22));
        this.t3 = new JPasswordField();
        this.t3.setFont(new Font("Raleway", 1, 22));
        this.b1 = new JButton("SAVE");
        this.b1.setFont(new Font("System", 1, 18));
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("BACK");
        this.b2.setFont(new Font("System", 1, 18));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(220, 130, 800, 60);
        this.add(this.l1);
        this.l2.setBounds(100, 240, 150, 40);
        this.add(this.l2);
        this.l3.setBounds(100, 300, 150, 40);
        this.add(this.l3);
        this.l4.setBounds(100, 360, 200, 40);
        this.add(this.l4);
        this.t1.setBounds(310, 240, 360, 40);
        this.add(this.t1);
        this.t2.setBounds(310, 300, 360, 40);
        this.add(this.t2);
        this.t3.setBounds(310, 360, 360, 40);
        this.add(this.t3);
        this.b1.setBounds(220, 460, 160, 50);
        this.add(this.b1);
        this.b2.setBounds(400, 460, 160, 50);
        this.add(this.b2);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(800, 800);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String a = this.t1.getText();
            String b = this.t2.getText();
            String c = this.t3.getText();
            if (ae.getSource() == this.b1) {
                if (this.t1.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Please Enter Current PIN");
                }

                if (this.t2.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Enter New PIN");
                }

                if (this.t3.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Re-Enter new PIN");
                }

                if (this.t2.getText().equals(this.t3.getText())) {
                    conn c1 = new conn();
                    String q1 = "update bank set pin = '" + b + "' where pin = '" + a + "' ";
                    String q2 = "update login set pin = '" + b + "' where pin = '" + a + "' ";
                    String q3 = "update signup3 set pin = '" + b + "' where pin = '" + a + "' ";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    JOptionPane.showMessageDialog((Component)null, "PIN changed successfully");
                    (new Transcations()).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "PIN entered doesn't match");
                }
            } else if (ae.getSource() == this.b2) {
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var9) {
            var9.printStackTrace();
            System.out.println("error: " + var9);
        }

    }

    public static void main(String[] args) {
        (new Pin()).setVisible(true);
    }
}
