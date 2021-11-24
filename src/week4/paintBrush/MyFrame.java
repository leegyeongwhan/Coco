package week4.paintBrush;

import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutTest");
        f.setSize(200, 200);
        Panel figure = new Panel();
        Panel removePanel = new Panel();
        Panel colorPanel = new Panel();
    //    Panel menuPanel = new Panel();
        figure.setLayout(new GridLayout(2, 2));
        removePanel.setLayout(new GridLayout(1, 1));
// Frame BorderLayout 은 기본적으로 로 설정되어 있으므로 따로 설정하지 않아도 됨
        f.setLayout(new BorderLayout());
        Button north = new Button("North");
        Button south = new Button("South");

        MenuBar mb = new MenuBar();
        Menu mEdit = new Menu("NEW");
        Menu mView = new Menu("OPEN");
        Menu mHelp = new Menu("EXIT");
        mb.add(mEdit);
        mb.add(mView);
        mb.add(mHelp);


//---------------------west-----------------------
        Button Square = new Button("Square");
        Button circle = new Button("circle");
        Button beeline = new Button("beeline");
        Button curve = new Button("curve");
        figure.add(Square);
        figure.add(circle);
        figure.add(beeline);
        figure.add(curve);
        Button west = new Button("West");
        //-------------------------------------------
        //-------east--------------
        Button allRemove = new Button("allRemove");
        Button selectRemove = new Button("selectRemove");
        removePanel.add(allRemove);
        removePanel.add(selectRemove);
//-------------------------------
        //--------------------south----------------------
        Button red = new Button("RED");
        Button green = new Button("GREEN");
        Button blue = new Button("BLUE");
        colorPanel.add(red);
        colorPanel.add(green);
        colorPanel.add(blue);
        //--------------------------------------
        Button center = new Button("Center");
// Frame 5 Button . 의 개의 각 영역에 을 하나씩 추가한다
        f.add(north, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
        f.add(colorPanel, "South"); // South의 대소문자 정확히
        f.add(removePanel, "East"); // East , BorderLayout.EAST 대신 사용가능
        f.add(figure, "West");
        f.add(center, "Center");
        f.setVisible(true);

    }
}
