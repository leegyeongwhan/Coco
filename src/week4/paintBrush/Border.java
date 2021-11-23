package week4.paintBrush;

import java.awt.*;
import javax.swing.*;

public class Border {
    JFrame f;

    Border() {
        f = new JFrame();

        // creating buttons
        JButton b1 = new JButton("NORTH");
        ; // the button will be labeled as NORTH
        JButton b2 = new JButton("SOUTH");
        ; // the button will be labeled as SOUTH
        JButton b3 = new JButton("EAST");
        ; // the button will be labeled as EAST
        JButton b4 = new JButton("WEST");
        ; // the button will be labeled as WEST
        JButton b5 = new JButton("CENTER");
        ; // the button will be labeled as CENTER

        f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction
        f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction
        f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction
        f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction
        f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center

        //   Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 50);
        //    hor.setSize(100, 15);
        //  hor.setLocation(60, 30);
//        Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
//        ver.setSize(15, 100);
//        ver.setLocation(30, 30);
//        //  f.add(hor);
//        f.add(ver);

        Canvas c = new Canvas();
        c.setBackground(Color.pink); // Canvas (pink) . 의 배경을 분홍색 으로 한다
        c.setBounds(50, 50, 150, 100);

        f.setSize(300, 300);
        f.add(c);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}