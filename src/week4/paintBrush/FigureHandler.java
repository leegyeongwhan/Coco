package week4.paintBrush;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;


public class FigureHandler implements ActionListener {
  private boolean isLine, isRect, isCir, isCuv;
//    String isLine="직선";
//    String isRect="직선";
//    String isCir="직선";
//    String isCuv="직선";

    FigureHandler(boolean isLine, boolean isCuv, boolean isRect, boolean isCir) {

    }

    FigureHandler() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("직선")) {
            isLine = true;
            isRect = false;
            isCir = false;
            isCuv = false;
        }
        if (e.getActionCommand().equals("곡선")) {
            isLine = false;
            isRect = false;
            isCir = false;
            isCuv = true;

        }
        if (e.getActionCommand().equals("사각형")) {
            isLine = false;
            isRect = true;
            isCir = false;
            isCuv = false;

        }
        if (e.getActionCommand().equals("원")) {
            isLine = false;
            isRect = false;
            isCir = true;
            isCuv = false;

        }

    }
}

