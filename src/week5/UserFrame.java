package week5;

import week4.paintBrush.MyFrame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class UserFrame extends Frame {
    private JButton jb5;

    UserFrame() {
    }

    public UserFrame(String title) {
        super(title);
        setBounds(250, 100, 1200, 800);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        UserPanelCreate();
        addMouseListener(new UserFrame.MouseHandler());
        addMouseMotionListener(new MouseAdapter() {

        });
        setVisible(true);
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }
    }


    public void UserPanelCreate() {
        JPanel buttonPanel1 = new JPanel();
        JPanel menuPanel1 = new JPanel();
        JPanel menuPanel2 = new JPanel();
        JPanel buttonPanel2 = new JPanel();
        ProductManager pm = new ProductManager();
        ProductFile pf = new ProductFile();
        //////
        List<ProductInfo> list = new ArrayList<ProductInfo>();
        pm.setProductList(pf.readProductFile());   //파일에있는 정보를 꺼내온후 list에 담는다
        list = pm.getProductList();
        //////
        JRadioButton  jb1;
        JRadioButton  jb2;
        JRadioButton  jb3;
        JRadioButton  jb4;
        jb1 = new JRadioButton (list.get(0).getName());       /////////////좋은 방법이 없을까??
        jb2 = new JRadioButton (list.get(1).getName());
        jb3 = new JRadioButton (list.get(2).getName());
        jb4 = new JRadioButton (list.get(3).getName());
        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        bg.add(jb4);
        buttonPanel1.add(jb1);
        buttonPanel1.add(jb2);
        buttonPanel1.add(jb3);
        buttonPanel1.add(jb4);
        JLabel jl1 = new JLabel("수   량 : ");
        JTextField su = new JTextField(5);
        JLabel jl2 = new JLabel("입  금 액 : ");
        JTextField money = new JTextField(5);
        menuPanel1.add(jl1);
        menuPanel1.add(su);
        menuPanel1.add(jl2);
        menuPanel1.add(money);
        JTextArea ja = new JTextArea(10, 30);
        menuPanel2.add(ja);
        jb5 = new JButton("계   산");
        JButton jb6 = new JButton("종   료");
        buttonPanel2.add(jb5);
        buttonPanel2.add(jb6);
        JPanel pg1 = new JPanel(new BorderLayout());
        JPanel pg2 = new JPanel(new BorderLayout());
        pg1.add(buttonPanel1, BorderLayout.NORTH);
        pg1.add(menuPanel1, BorderLayout.CENTER);
        pg2.add(menuPanel2, BorderLayout.NORTH);
        pg2.add(buttonPanel2, BorderLayout.CENTER);
        add(pg1, BorderLayout.NORTH);
        add(pg2, BorderLayout.CENTER);

        List<ProductInfo> finalList = list;
     //   System.out.println(finalList);
        jb5.addActionListener(new ActionListener() {   //계산버튼
            @Override
            public void actionPerformed(ActionEvent e) {
                /////품목이름
                String name = "";
                ///////가격
                int price = 0;
                ////////// 수량 체크
                int[] amount = new int[finalList.size()];
                for (int i = 0; i < finalList.size(); i++) {
                    amount[i] = finalList.get(i).getCount();
                }
                if (jb1.isSelected()) {
                    name = finalList.get(0).getName();
                    price = finalList.get(0).getPrice();
                } else if (jb2.isSelected()) {
                    name = jb2.getName();
                    price = finalList.get(1).getPrice();
                } else if (jb3.isSelected()) {
                    name = jb3.getName();
                    price = finalList.get(2).getPrice();
                } else if (jb4.isSelected()) {
                    name = jb4.getName();
                    price = finalList.get(3).getPrice();
                }
                int su1 = Integer.parseInt(su.getText());
                int money1 = Integer.parseInt(money.getText());
                ja.append("제품명:" + name + "\n");
                ja.append("수 량" + su1 + "\n");
                ja.append("넣은돈" + money1 + "\n");
                ja.append("거스름돈" + (money1 - price) + "\n");
                ja.append("남은 수량" + (amount[0] - su1) + "\n");             //수량,가격,거스름돈
                bg.clearSelection();
                su.setText(null);
                money.setText(null);
            }
        });


    }


}
