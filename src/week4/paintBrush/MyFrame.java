package week4.paintBrush;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    Button red, green, blue;
    Button allRemove,selectRemove;
    public MyFrame() {
        Frame f = new Frame("그림판");
        f.setSize(200, 200);
        Panel figure = new Panel();
        Panel removePanel = new Panel();
        Panel colorPanel = new Panel();
        Panel center = new Panel();
        // 캔버스 부착
//        MyCanvas mc = new MyCanvas();
//        center.add(mc);
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
        Button square = new Button("Square");
        Button circle = new Button("circle");
        Button beeline = new Button("beeline");
        Button curve = new Button("curve");
        figure.add(square);
        figure.add(circle);
        figure.add(beeline);
        figure.add(curve);
        Button west = new Button("West");
        //-------------------------------------------
        //-------east--------------
         allRemove = new Button("allRemove");
        selectRemove = new Button("selectRemove");
        removePanel.add(allRemove);
        removePanel.add(selectRemove);
//-------------------------------
        //--------------------south----------------------
        red = new Button("RED");
        green = new Button("GREEN");
        blue = new Button("BLUE");
        colorPanel.add(red);
        colorPanel.add(green);
        colorPanel.add(blue);
        //--------------------------------------
        // Button center = new Button("Center");
// Frame 5 Button . 의 개의 각 영역에 을 하나씩 추가한다
        f.add(north, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
        f.add(colorPanel, "South"); // South의 대소문자 정확히
        f.add(removePanel, "East"); // East , BorderLayout.EAST 대신 사용가능
        f.add(figure, "West");
        f.add(center, "Center");
        f.setVisible(true);
        //-------------------------------켄버스


///------리스너 부착----------
        EventHandler eh = new EventHandler();
        square.addActionListener(eh);
        circle.addActionListener(eh);
        beeline.addActionListener(eh);
        curve.addActionListener(eh);

        red.addActionListener(eh);
        green.addActionListener(eh);
        blue.addActionListener(eh);

        allRemove.addActionListener(eh);
        selectRemove.addActionListener(eh);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
