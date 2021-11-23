package week4.AwtStudy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest2 extends Frame {
    Label lid;
    Label lpwd;
    TextField tfId;
    TextField tfPwd;
    Button ok;

    TextFieldTest2(String title) {
        super(title); //feame (String title)호출

        lid = new Label("ID:", Label.RIGHT);
        lpwd = new Label("password:",Label.RIGHT);

        tfId = new TextField(10);
        tfPwd = new TextField(10);
        tfPwd.setEchoChar('*');
        ok=  new Button("OK");
        tfId.addActionListener(new EventHandler());
        tfPwd.addActionListener(new EventHandler());
        ok.addActionListener(new EventHandler());
        add(lid); // Component Frame . 생성한 들을 에 포함시킨다
        add(tfId);
        add(lpwd);
        add(tfPwd);
        add(ok);
        setSize(450, 65);
        setVisible(true); // Frame . 이 화면에 보이게 한다
    }
    public static void main(String args[]) {
        TextFieldTest2 f = new TextFieldTest2("Login");
    }



class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String id = tfId.getText(); // tfId text . 에 입력되어있는 를 얻어온다
        String password = tfPwd.getText();
        if (!id.equals("javachobo")) {
            System.out.println();
// id , focus tfId . 를 다시 입력할 수 있도록 를 로 옮긴다
            tfId.requestFocus();
            tfId.selectAll(); // tfId text . 에 입력된 가 선택되게 한다
        } else if (!password.equals("asdf")) {
            System.out.println( "입력하신 비밀번호가 틀렸습니다");
            // id focus tfId . 를 다시 입력할 수 있도록 를 로 옮긴다
            tfPwd.requestFocus();
            tfPwd.selectAll();
        } else {
            System.out.println(id + " , .");
        }
    }
} // class EventHandler
}