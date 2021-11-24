package week4.paintBrush;

import java.awt.*;
import java.awt.event.*;

class EventHandler extends MouseMotionAdapter implements ActionListener {
    MyCanvas can = new MyCanvas();
    MyFrame f = new MyFrame();
    public void mouseDragged(MouseEvent e) {
        can.x = e.getX();
        can.y = e.getY();
        can.repaint();
    }
    public void actionPerformed(ActionEvent e) {  //클릭시
        Object o = e.getSource();
        can.flag = 0;//flag를 0으로 주어 그리기가 기본작업이 되게 한다.
        if (o == f.red) {
            can.cr = Color.red;
        } else if (o == f.green) {
            can.cr = Color.green;
        } else if (o == f.blue) {
            can.cr = Color.blue;
        } else if (o == f.selectRemove) {
            can.cr = can.getBackground(); //배경색을 칠해서 지우기
        } else if (o == f.allRemove) {
            can.flag = 1;
            can.repaint();
        }
    }
}