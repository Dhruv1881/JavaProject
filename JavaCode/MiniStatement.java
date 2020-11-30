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

public class MiniStatement extends JFrame implements ActionListener {
    JTable t1;
    JButton b1;
    String[] x = new String[]{"Customer Name", "Date", "Deposit", "Withdraw", "Balance"};
    String[][] y = new String[20][5];
    int i = 0;
    int j = 0;

    MiniStatement() {
        super("Mini Statement");
        this.setSize(1200, 650);
        setLocationRelativeTo(null);

        try {
            conn c1 = new conn();
            String s1 = "select * from bank";

            for(ResultSet rs = c1.s.executeQuery(s1); rs.next(); this.j = 0) {
                this.y[this.i][this.j++] = rs.getString("customer_name");
                this.y[this.i][this.j++] = rs.getString("date");
                this.y[this.i][this.j++] = rs.getString("deposit");
                this.y[this.i][this.j++] = rs.getString("withdraw");
                this.y[this.i][this.j++] = rs.getString("balance");
                ++this.i;
            }

            this.t1 = new JTable(this.y, this.x);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        this.b1 = new JButton("Print");
        this.add(this.b1, "South");
        JScrollPane sp = new JScrollPane(this.t1);
        this.add(sp);
        this.b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            this.t1.print();
        } catch (Exception var3) {
        }

    }

    public static void main(String[] args) {
        (new MiniStatement()).setVisible(true);
    }
}
