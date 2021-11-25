package week4.paintBrush;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    Button red, green, blue;
    Button allRemove, selectRemove;
    Button square, circle, beeline, curve;
    MenuBar menuBar = new MenuBar();
    private int lwidth = 3;
    private int x1, y1, x2, y2,dx1,dy1;
    private boolean isLine = true;
    private  boolean isBlack,isRed,isBlue;
    private  boolean isRect,isCir,isCuv;
    MyFrame(){

    }
    public MyFrame(String title) {
        super(title);
        setBounds(250, 100, 1200, 800);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        creatLayout();
        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (isLine) {
                    dx1 = me.getX();
                    dy1 = me.getY();
                    repaint();
                }
            }
        });
        setVisible(true);
    }


    public void creatLayout() {
        //---------------------------판넬 레이아웃 설정-----------------------------------------------
        Panel figurePanel = new Panel();
        Panel removePanel = new Panel();
        Panel colorPanel = new Panel();
        Panel center = new Panel();

        figurePanel.setLayout(new GridLayout(2, 2));
        removePanel.setLayout(new GridLayout(1, 1));
        setLayout(new BorderLayout());
        Button north = new Button("North");
        MenuBar mb = new MenuBar();
        Menu mEdit = new Menu("NEW");
        Menu mView = new Menu("OPEN");
        Menu mHelp = new Menu("EXIT");
        mb.add(mEdit);
        mb.add(mView);
        mb.add(mHelp);
        // -----------------------------------------------------------

        //---------------------west-----------------------
        square = new Button("사각형");
        circle = new Button("원");
        beeline = new Button("직선");
        curve = new Button("곡선");

        square.addActionListener(new FigureHandler());
        circle.addActionListener(new FigureHandler());
        beeline.addActionListener(new FigureHandler());
        curve.addActionListener(new FigureHandler());
        figurePanel.add(square);
        figurePanel.add(circle);
        figurePanel.add(beeline);
        figurePanel.add(curve);

        //-------------------------------------------


        //-------east------------------------
        allRemove = new Button("allRemove");
        selectRemove = new Button("selectRemove");
        removePanel.add(allRemove);
        removePanel.add(selectRemove);
        //-------------------------------------------


        //--------------------south----------------------
        red = new Button("RED");
        green = new Button("GREEN");
        blue = new Button("BLUE");

        red.addActionListener(new ColorHandler());
        green.addActionListener(new ColorHandler());
        blue.addActionListener(new ColorHandler());
        colorPanel.add(red);
        colorPanel.add(green);
        colorPanel.add(blue);
        //--------------------------------------


// ---------------------------FRAME에 판넬추가------------------------------------------
        add(north, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
        add(colorPanel, "South"); // South의 대소문자 정확히
        add(removePanel, "East"); // East , BorderLayout.EAST 대신 사용가능
        add(figurePanel, "West");
        add(center, "Center");

//        --------------------------------------------------------------

    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;  //참조변수 형변환
        g2.setStroke(new BasicStroke(lwidth));

        if (isBlack) {
            g2.setColor(Color.black);
        }
        if (isRed) {
            g2.setColor(Color.red);
        }
        if (isBlue) {
            g2.setColor(Color.blue);
        }

        if (isLine) {
            g2.drawLine(x1, y1, x2, y2);
        }
        if (isRect) {
            g2.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
        }
        if (isCir) {
            g2.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
        }
        if (isCuv) {
            g2.fillOval(dx1 - 5, dy1 - 5, 10, 10);
        }
    }



    public void paint(Graphics g) {
        paintComponent(g);
    }


    public void update(Graphics g) {
        paint(g);
    }


    private class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            repaint();
        }
    }


}
