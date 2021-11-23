package week4.AwtStudy;

import java.awt.*;

public class AwtPratice {
    public static void main(String[] args) {
        Frame f = new Frame("brushPan");
        f.setSize(400,400);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();  //화면의 크기를 구한다
        f.setLocation(screenSize.width/2 - 150, screenSize.height/2 - 100);
//        Choice day = new Choice();
//        day.add("SUN");
//        day.add("MON");
//        day.add("TUE");
//        day.add("WED");
//        day.add("THU");
//        day.setSize(100,50);
//        day.setLocation(100,60);
//        frame.add(day);

//        Button bt1 = new Button("확인");
//        Button bt2 = new Button("붓");
//        bt1.setSize(100,50);
//        bt2.setSize(100,20);
//        frame.add(bt1);
//        frame.add(bt2);
//        frame.setLayout(null);
        f.setLayout(new FlowLayout());

        Label q1 = new Label("당신의 관심분야는 여러개선택가능");
        Checkbox news =  new Checkbox("news",true);
        Checkbox sports = new Checkbox("sports");
        Checkbox movies = new Checkbox("movies");
        Checkbox music = new Checkbox("music");

        f.add(q1); f.add(news); f.add(sports); f.add(movies); f.add(music);
        f.setVisible(true);  //화면출력 필수
    }
}
