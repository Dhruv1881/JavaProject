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

public class FastCash extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JTextField t1;

    FastCash() {
        super("Fast Cash");
        this.l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        this.l1.setFont(new Font("System", 1, 38));
        this.l2 = new JLabel("Enter PIN");
        this.l2.setFont(new Font("System", 1, 13));
        this.t1 = new JTextField();
        this.t1.setFont(new Font("System", 1, 13));
        this.b1 = new JButton("Rs 100");
        this.b1.setFont(new Font("System", 1, 18));
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b2 = new JButton("Rs 500");
        this.b2.setFont(new Font("System", 1, 18));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b3 = new JButton("Rs 1000");
        this.b3.setFont(new Font("System", 1, 18));
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.b4 = new JButton("Rs 2000");
        this.b4.setFont(new Font("System", 1, 18));
        this.b4.setBackground(Color.BLACK);
        this.b4.setForeground(Color.WHITE);
        this.b5 = new JButton("Rs 5000");
        this.b5.setFont(new Font("System", 1, 18));
        this.b5.setBackground(Color.BLACK);
        this.b5.setForeground(Color.WHITE);
        this.b6 = new JButton("Rs 10000");
        this.b6.setFont(new Font("System", 1, 18));
        this.b6.setBackground(Color.BLACK);
        this.b6.setForeground(Color.WHITE);
        this.b7 = new JButton("BACK");
        this.b7.setFont(new Font("System", 1, 18));
        this.b7.setBackground(Color.BLACK);
        this.b7.setForeground(Color.WHITE);
        this.b7 = new JButton("EXIT");
        this.b7.setFont(new Font("System", 1, 18));
        this.b7.setBackground(Color.BLACK);
        this.b7.setForeground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.l2.setBounds(640, 10, 60, 40);
        this.add(this.l2);
        this.t1.setBounds(710, 10, 60, 40);
        this.add(this.t1);
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
        try {
            String a = this.t1.getText();
            double balance = 0.0D;
            conn c1;
            ResultSet rs;
            String pin;
            String q1;
            if (ae.getSource() == this.b1) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 100.0D;
                    q1 = "insert into bank values('" + pin + "',null,100,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 100 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b2) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 500.0D;
                    q1 = "insert into bank values('" + pin + "',null,500,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 500 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b3) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 1000.0D;
                    q1 = "insert into bank values('" + pin + "',null,1000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 1000 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b4) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 2000.0D;
                    q1 = "insert into bank values('" + pin + "',null,2000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 2000 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b5) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 5000.0D;
                    q1 = "insert into bank values('" + pin + "',null,5000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 5000 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b6) {
                c1 = new conn();
                rs = c1.s.executeQuery(" select * from bank where pin = '" + a + "' ");
                if (rs.next()) {
                    pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    balance -= 10000.0D;
                    q1 = "insert into bank values('" + pin + "',null,10000,'" + balance + "')";
                    c1.s.executeUpdate(q1);
                }

                JOptionPane.showMessageDialog((Component)null, "Rs. 10000 Debited Successfully");
                (new Transcations()).setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == this.b7) {
                System.exit(0);
            }
        } catch (Exception var9) {
            var9.printStackTrace();
            System.out.println("error: " + var9);
        }

    }

    public static void main(String[] args) {
        (new FastCash()).setVisible(true);
    }
}
