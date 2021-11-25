package week4.paintBrush;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ColorHandler implements ActionListener {
    //        String isBlack = "검은색";
//        String isRed = "빨간색";
//        String isBlue = "빨간색";
    private boolean isBlack, isRed, isBlue;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("검은색")) {
            isBlack = true;
            isRed = false;
            isBlue = false;
        }
        if (e.getActionCommand().equals("빨간색")) {
            isBlack = false;
            isRed = true;
            isBlue = false;
        }
        if (e.getActionCommand().equals("파란색")) {
            isBlack = false;
            isRed = false;
            isBlue = true;
        }
    }
}


