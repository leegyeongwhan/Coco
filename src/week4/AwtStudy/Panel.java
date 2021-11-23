package week4.AwtStudy;

import java.awt.*;

class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("Panel");
        f.setSize(300, 200);
        f.setLayout(null);

        Panel p = new Panel();
        p.setBackground(Color.green); // Panel . 의 배경을 녹색으로 한다
        p.setSize(100, 100);
        p.setLocation(50, 50);

        Button ok = new Button("OK");
        p.add(ok); // Button Panel . 을 에 포함시킨다
        f.add(p); // Panel Frame . 을 에 포함시킨다
        f.setVisible(true);

    }
}
