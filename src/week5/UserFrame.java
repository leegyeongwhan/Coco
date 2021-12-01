package week5;

import javax.swing.*;
import java.awt.*;

public class UserFrame extends Frame {
    public void UserFrameCreate() {
        setTitle("자판기");
        JPanel buttonPanel1 = new JPanel();
        JPanel menuPanel1 = new JPanel();
        JPanel menuPanel2 = new JPanel();
        JPanel buttonPanel2 = new JPanel();
//        ProductManager pm = new ProductManager();
//        ProductFile pf = new ProductFile();
//        pm.setProductList(pf.readProductFile());

        JButton jb1 = new JButton("콜라");
        JButton jb2 = new JButton("사이다");
        JButton jb3 = new JButton("밀키스");
        JButton jb4 = new JButton("환타");
        buttonPanel1.add(jb1);
        buttonPanel1.add(jb2);
        buttonPanel1.add(jb3);
        buttonPanel1.add(jb4);
        JLabel jl1 = new JLabel("수   량 : ");
        JTextField jf1 = new JTextField(5);
        JLabel jl2 = new JLabel("입  금 액 : ");
        JTextField jf2 = new JTextField(5);
        menuPanel1.add(jl1);
        menuPanel1.add(jf1);
        menuPanel1.add(jl2);
        menuPanel1.add(jf2);
        JTextArea ja = new JTextArea(10, 30);
        menuPanel2.add(ja);
        JButton jb5 = new JButton("계   산");
        JButton jb6 = new JButton("종   료");
        buttonPanel2.add(jb5);
        buttonPanel2.add(jb6);
        JPanel pg1 = new JPanel(new BorderLayout());
        JPanel pg2 = new JPanel(new BorderLayout());
        pg1.add(buttonPanel1,BorderLayout.NORTH);
        pg1.add(menuPanel1,BorderLayout.CENTER);
        pg2.add(menuPanel2,BorderLayout.NORTH);
        pg2.add(buttonPanel2,BorderLayout.CENTER);
        add(pg1, BorderLayout.NORTH);
        add(pg2, BorderLayout.CENTER);

        setBounds(200, 200, 300, 300);
        setVisible(true);
    }
}
