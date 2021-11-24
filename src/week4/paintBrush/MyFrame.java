package week4.paintBrush;

import week4.paintBrush.MyCanvas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class MyFrame extends Frame {
    Button red, green, blue;
    Button allRemove, selectRemove;
    Button square, circle, beeline, curve;

    public MyFrame() {
        super("그림판");
        Frame f = new Frame();
        Panel figurePanel = new Panel();
        Panel removePanel = new Panel();
        Panel colorPanel = new Panel();
        Panel center = new Panel();
        // 캔버스 부착
        figurePanel.setLayout(new GridLayout(2, 2));
        removePanel.setLayout(new GridLayout(1, 1));
// Frame BorderLayout 은 기본적으로 로 설정되어 있으므로 따로 설정하지 않아도 됨
        f.setLayout(new BorderLayout());
        Button north = new Button("North");
        MenuBar mb = new MenuBar();
        Menu mEdit = new Menu("NEW");
        Menu mView = new Menu("OPEN");
        Menu mHelp = new Menu("EXIT");
        mb.add(mEdit);
        mb.add(mView);
        mb.add(mHelp);

//---------------------west-----------------------
        square = new Button("사각형");
        circle = new Button("원");
        beeline = new Button("직선");
        curve = new Button("곡선");

        square.addActionListener(new EventHandler());
        circle.addActionListener(new EventHandler());
        beeline.addActionListener(new EventHandler());
        curve.addActionListener(new EventHandler());
        figurePanel.add(square);
        figurePanel.add(circle);
        figurePanel.add(beeline);
        figurePanel.add(curve);


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

        red.addActionListener(new EventHandler());
        green.addActionListener(new EventHandler());
        blue.addActionListener(new EventHandler());
        colorPanel.add(red);
        colorPanel.add(green);
        colorPanel.add(blue);
        //--------------------------------------

//        MyCanvas can = new MyCanvas();
//        can=new MyCanvas();
//        can.setSize(300,300);
//        can.setBackground(Color.white);
//        center.add(can);


// Frame 5 Button . 의 개의 각 영역에 을 하나씩 추가한다
        f.add(north, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
        f.add(colorPanel, "South"); // South의 대소문자 정확히
        f.add(removePanel, "East"); // East , BorderLayout.EAST 대신 사용가능
        f.add(figurePanel, "West");
        f.add(center, "Center");


        //   f.setVisible(true);
        f.setSize(500, 500);
        f.setVisible(true);
//        -------------------------------켄버스


//        EventHandler eh = new EventHandler(f);

//        circle.addActionListener(eh);
//        beeline.addActionListener(eh);
//        curve.addActionListener(eh);
//
//        red.addActionListener(eh);
//        green.addActionListener(eh);
//        blue.addActionListener(eh);
//
//        allRemove.addActionListener(eh);
//        selectRemove.addActionListener(eh);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
