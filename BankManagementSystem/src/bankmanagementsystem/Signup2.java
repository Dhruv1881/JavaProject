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

public class Signup2 extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3;
    JRadioButton r1,r2,r3,r4;
    JButton b;
    JComboBox c1,c2,c3,c4,c5;

    Signup2() {
        super("Second SignUP Page");
        this.l1 = new JLabel("Page 2: Additonal Details");
        this.l1.setFont(new Font("Raleway", 1, 22));
        this.l2 = new JLabel("Religion:");
        this.l2.setFont(new Font("Raleway", 1, 18));
        this.l3 = new JLabel("Category:");
        this.l3.setFont(new Font("Raleway", 1, 18));
        this.l4 = new JLabel("Income:");
        this.l4.setFont(new Font("Raleway", 1, 18));
        this.l5 = new JLabel("Educational");
        this.l5.setFont(new Font("Raleway", 1, 18));
        this.l11 = new JLabel("Qualification:");
        this.l11.setFont(new Font("Raleway", 1, 18));
        this.l6 = new JLabel("Occupation:");
        this.l6.setFont(new Font("Raleway", 1, 18));
        this.l7 = new JLabel("PAN Number:");
        this.l7.setFont(new Font("Raleway", 1, 18));
        this.l8 = new JLabel("Aadhar Number:");
        this.l8.setFont(new Font("Raleway", 1, 18));
        this.l9 = new JLabel("Senior Citizen:");
        this.l9.setFont(new Font("Raleway", 1, 18));
        this.l10 = new JLabel("Existing Account:");
        this.l10.setFont(new Font("Raleway", 1, 18));
        this.l12 = new JLabel("Form No:");
        this.l12.setFont(new Font("Raleway", 1, 13));
        this.b = new JButton("Next");
        this.b.setFont(new Font("Raleway", 1, 14));
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        this.t1 = new JTextField();
        this.t1.setFont(new Font("Raleway", 1, 14));
        this.t2 = new JTextField();
        this.t2.setFont(new Font("Raleway", 1, 14));
        this.t3 = new JTextField();
        this.t3.setFont(new Font("Raleway", 1, 13));
        this.r1 = new JRadioButton("Yes");
        this.r1.setFont(new Font("Raleway", 1, 14));
        this.r1.setBackground(Color.WHITE);
        this.r2 = new JRadioButton("No");
        this.r2.setFont(new Font("Raleway", 1, 14));
        this.r2.setBackground(Color.WHITE);
        this.r3 = new JRadioButton("Yes");
        this.r3.setFont(new Font("Raleway", 1, 14));
        this.r3.setBackground(Color.WHITE);
        this.r4 = new JRadioButton("No");
        this.r4.setFont(new Font("Raleway", 1, 14));
        this.r4.setBackground(Color.WHITE);
        String[] religion = new String[]{"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        this.c1 = new JComboBox(religion);
        this.c1.setBackground(Color.WHITE);
        this.c1.setFont(new Font("Raleway", 1, 14));
        String[] category = new String[]{"General", "OBC", "SC", "ST", "Other"};
        this.c2 = new JComboBox(category);
        this.c2.setBackground(Color.WHITE);
        this.c2.setFont(new Font("Raleway", 1, 14));
        String[] income = new String[]{"100", "200", "300", "400", "500", "600"};
        this.c3 = new JComboBox(income);
        this.c3.setBackground(Color.WHITE);
        this.c3.setFont(new Font("Raleway", 1, 14));
        String[] education = new String[]{"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        this.c4 = new JComboBox(education);
        this.c4.setBackground(Color.WHITE);
        this.c4.setFont(new Font("Raleway", 1, 14));
        String[] occupation = new String[]{"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
        this.c5 = new JComboBox(occupation);
        this.c5.setBackground(Color.WHITE);
        this.c5.setFont(new Font("Raleway", 1, 14));
        this.setLayout((LayoutManager)null);
        this.l12.setBounds(700, 10, 60, 30);
        this.add(this.l12);
        this.t3.setBounds(760, 10, 60, 30);
        this.add(this.t3);
        this.l1.setBounds(280, 30, 600, 40);
        this.add(this.l1);
        this.l2.setBounds(100, 120, 100, 30);
        this.add(this.l2);
        this.c1.setBounds(350, 120, 320, 30);
        this.add(this.c1);
        this.l3.setBounds(100, 170, 100, 30);
        this.add(this.l3);
        this.c2.setBounds(350, 170, 320, 30);
        this.add(this.c2);
        this.l4.setBounds(100, 220, 100, 30);
        this.add(this.l4);
        this.c3.setBounds(350, 220, 320, 30);
        this.add(this.c3);
        this.l5.setBounds(100, 270, 150, 30);
        this.add(this.l5);
        this.c4.setBounds(350, 270, 320, 30);
        this.add(this.c4);
        this.l11.setBounds(100, 290, 150, 30);
        this.add(this.l11);
        this.l6.setBounds(100, 340, 150, 30);
        this.add(this.l6);
        this.c5.setBounds(350, 340, 320, 30);
        this.add(this.c5);
        this.l7.setBounds(100, 390, 150, 30);
        this.add(this.l7);
        this.t1.setBounds(350, 390, 320, 30);
        this.add(this.t1);
        this.l8.setBounds(100, 440, 180, 30);
        this.add(this.l8);
        this.t2.setBounds(350, 440, 320, 30);
        this.add(this.t2);
        this.l9.setBounds(100, 490, 150, 30);
        this.add(this.l9);
        this.r1.setBounds(350, 490, 100, 30);
        this.add(this.r1);
        this.r2.setBounds(460, 490, 100, 30);
        this.add(this.r2);
        this.l10.setBounds(100, 540, 180, 30);
        this.add(this.l10);
        this.r3.setBounds(350, 540, 100, 30);
        this.add(this.r3);
        this.r4.setBounds(460, 540, 100, 30);
        this.add(this.r4);
        this.b.setBounds(570, 600, 100, 30);
        this.add(this.b);
        this.b.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(850, 850);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = (String)this.c1.getSelectedItem();
        String b = (String)this.c2.getSelectedItem();
        String c = (String)this.c3.getSelectedItem();
        String d = (String)this.c4.getSelectedItem();
        String e = (String)this.c5.getSelectedItem();
        String f = this.t1.getText();
        String g = this.t2.getText();
        String h = "";
        if (this.r1.isSelected()) {
            h = "Yes";
        } else if (this.r2.isSelected()) {
            h = "No";
        }

        String i = "";
        if (this.r3.isSelected()) {
            i = "Yes";
        } else if (this.r4.isSelected()) {
            i = "No";
        }

        String j = this.t3.getText();

        try {
            if (this.t2.getText().equals("")) {
                JOptionPane.showMessageDialog((Component)null, "Fill all the required fields");
            } else {
                conn c1 = new conn();
                String q1 = "insert into signup2 values('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "')";
                c1.s.executeUpdate(q1);
                (new Signup3()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

    }

    public static void main(String[] args) {
        (new Signup2()).setVisible(true);
    }
}
