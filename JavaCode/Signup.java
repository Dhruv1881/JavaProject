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

public class Signup extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1,c2,c3;
    Random ran = new Random();
    long first4,first;

    Signup() {
        super("First SignUP Page");
        this.first4 = this.ran.nextLong() % 9000L + 1000L;
        this.first = Math.abs(this.first4);
        this.l1 = new JLabel("APPLICATION FORM NO. " + this.first);
        this.l1.setFont(new Font("Raleway", 1, 38));
        this.l2 = new JLabel("Page 1: Personal Details");
        this.l2.setFont(new Font("Raleway", 1, 22));
        this.l3 = new JLabel("Name:");
        this.l3.setFont(new Font("Raleway", 1, 20));
        this.l4 = new JLabel("Father's Name:");
        this.l4.setFont(new Font("Raleway", 1, 20));
        this.l5 = new JLabel("Date of Birth:");
        this.l5.setFont(new Font("Raleway", 1, 20));
        this.l6 = new JLabel("Gender:");
        this.l6.setFont(new Font("Raleway", 1, 20));
        this.l7 = new JLabel("Email Address:");
        this.l7.setFont(new Font("Raleway", 1, 20));
        this.l8 = new JLabel("Marital Status:");
        this.l8.setFont(new Font("Raleway", 1, 20));
        this.l9 = new JLabel("Address:");
        this.l9.setFont(new Font("Raleway", 1, 20));
        this.l10 = new JLabel("City:");
        this.l10.setFont(new Font("Raleway", 1, 20));
        this.l11 = new JLabel("Pin Code:");
        this.l11.setFont(new Font("Raleway", 1, 20));
        this.l12 = new JLabel("State:");
        this.l12.setFont(new Font("Raleway", 1, 20));
        this.l13 = new JLabel("Date");
        this.l13.setFont(new Font("Raleway", 1, 14));
        this.l14 = new JLabel("Month");
        this.l14.setFont(new Font("Raleway", 1, 14));
        this.l15 = new JLabel("Year");
        this.l15.setFont(new Font("Raleway", 1, 14));
        this.t1 = new JTextField();
        this.t1.setFont(new Font("Raleway", 1, 14));
        this.t2 = new JTextField();
        this.t2.setFont(new Font("Raleway", 1, 14));
        this.t3 = new JTextField();
        this.t3.setFont(new Font("Raleway", 1, 14));
        this.t4 = new JTextField();
        this.t4.setFont(new Font("Raleway", 1, 14));
        this.t5 = new JTextField();
        this.t5.setFont(new Font("Raleway", 1, 14));
        this.t6 = new JTextField();
        this.t6.setFont(new Font("Raleway", 1, 14));
        this.t7 = new JTextField();
        this.t7.setFont(new Font("Raleway", 1, 14));
        this.b = new JButton("Next");
        this.b.setFont(new Font("Raleway", 1, 14));
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        this.r1 = new JRadioButton("Male");
        this.r1.setFont(new Font("Raleway", 1, 14));
        this.r1.setBackground(Color.WHITE);
        this.r2 = new JRadioButton("Female");
        this.r2.setFont(new Font("Raleway", 1, 14));
        this.r2.setBackground(Color.WHITE);
        this.r3 = new JRadioButton("Married");
        this.r3.setFont(new Font("Raleway", 1, 14));
        this.r3.setBackground(Color.WHITE);
        this.r4 = new JRadioButton("Unmarried");
        this.r4.setFont(new Font("Raleway", 1, 14));
        this.r4.setBackground(Color.WHITE);
        this.r5 = new JRadioButton("Other");
        this.r5.setFont(new Font("Raleway", 1, 14));
        this.r5.setBackground(Color.WHITE);
        String[] date = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        this.c1 = new JComboBox(date);
        this.c1.setBackground(Color.WHITE);
        String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        this.c2 = new JComboBox(month);
        this.c2.setBackground(Color.WHITE);
        String[] year = new String[]{"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"};
        this.c3 = new JComboBox(year);
        this.c3.setBackground(Color.WHITE);
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(140, 20, 600, 40);
        this.add(this.l1);
        this.l2.setBounds(290, 70, 600, 30);
        this.add(this.l2);
        this.l3.setBounds(100, 140, 100, 30);
        this.add(this.l3);
        this.t1.setBounds(300, 140, 400, 30);
        this.add(this.t1);
        this.l4.setBounds(100, 190, 200, 30);
        this.add(this.l4);
        this.t2.setBounds(300, 190, 400, 30);
        this.add(this.t2);
        this.l5.setBounds(100, 240, 200, 30);
        this.add(this.l5);
        this.l13.setBounds(300, 240, 40, 30);
        this.add(this.l13);
        this.c1.setBounds(340, 240, 60, 30);
        this.add(this.c1);
        this.l14.setBounds(410, 240, 50, 30);
        this.add(this.l14);
        this.c2.setBounds(460, 240, 100, 30);
        this.add(this.c2);
        this.l15.setBounds(570, 240, 40, 30);
        this.add(this.l15);
        this.c3.setBounds(610, 240, 90, 30);
        this.add(this.c3);
        this.l6.setBounds(100, 290, 200, 30);
        this.add(this.l6);
        this.r1.setBounds(300, 290, 60, 30);
        this.add(this.r1);
        this.r2.setBounds(450, 290, 90, 30);
        this.add(this.r2);
        this.l7.setBounds(100, 340, 200, 30);
        this.add(this.l7);
        this.t3.setBounds(300, 340, 400, 30);
        this.add(this.t3);
        this.l8.setBounds(100, 390, 200, 30);
        this.add(this.l8);
        this.r3.setBounds(300, 390, 100, 30);
        this.add(this.r3);
        this.r4.setBounds(450, 390, 100, 30);
        this.add(this.r4);
        this.r5.setBounds(635, 390, 100, 30);
        this.add(this.r5);
        this.l9.setBounds(100, 440, 200, 30);
        this.add(this.l9);
        this.t4.setBounds(300, 440, 400, 30);
        this.add(this.t4);
        this.l10.setBounds(100, 490, 200, 30);
        this.add(this.l10);
        this.t5.setBounds(300, 490, 400, 30);
        this.add(this.t5);
        this.l11.setBounds(100, 540, 200, 30);
        this.add(this.l11);
        this.t6.setBounds(300, 540, 400, 30);
        this.add(this.t6);
        this.l12.setBounds(100, 590, 200, 30);
        this.add(this.l12);
        this.t7.setBounds(300, 590, 400, 30);
        this.add(this.t7);
        this.b.setBounds(620, 660, 80, 30);
        this.add(this.b);
        this.b.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(850, 850);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = this.t1.getText();
        String b = this.t2.getText();
        String ac = (String)this.c1.getSelectedItem();
        String bc = (String)this.c2.getSelectedItem();
        String cc = (String)this.c3.getSelectedItem();
        String d = null;
        if (this.r1.isSelected()) {
            d = "Male";
        } else if (this.r2.isSelected()) {
            d = "Female";
        }

        String e = this.t3.getText();
        String f = null;
        if (this.r3.isSelected()) {
            f = "Married";
        } else if (this.r4.isSelected()) {
            f = "Unmarried";
        } else if (this.r5.isSelected()) {
            f = "Other";
        }

        String g = this.t4.getText();
        String h = this.t5.getText();
        String i = this.t6.getText();
        String j = this.t7.getText();

        try {
            if (this.t6.getText().equals("")) {
                JOptionPane.showMessageDialog((Component)null, "Fill all the required fields");
            } else {
                conn c1 = new conn();
                String q1 = "insert into signup values('" + a + "','" + b + "','" + ac + "','" + bc + "','" + cc + "','" + d + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "','" + this.first + "')";
                c1.s.executeUpdate(q1);
                (new Signup2()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var16) {
            var16.printStackTrace();
        }

    }

    public static void main(String[] args) {
        (new Signup()).setVisible(true);
    }
}
