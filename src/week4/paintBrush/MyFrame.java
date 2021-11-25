package week4.paintBrush;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private static int dx1;
    private static int dy1;
    private boolean isBlack = true;
    private boolean isRed = false;
    private boolean isBlue = false;
    private boolean isLine = true;
    private boolean isRect = false;
    private boolean isCir = false;
    private boolean isCuv = false;

    private int lwidth = 3;

    MyFrame() {

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
                if (isCuv) {
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

        Checkbox line = new Checkbox("직선", true);
        MenuBar mb = new MenuBar();
        Menu mEdit = new Menu("NEW");
        Menu mView = new Menu("OPEN");
        Menu mHelp = new Menu("EXIT");
        mb.add(mEdit);
        mb.add(mView);
        mb.add(mHelp);
        // -----------------------------------------------------------

        //---------------------west-----------------------
        Button square = new Button("사각형");
        Button circle = new Button("원");
        Button beeline = new Button("직선");
        Button curve = new Button("곡선");

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
        Button  allRemove = new Button("allRemove");
        Button  selectRemove = new Button("selectRemove");
        removePanel.add(allRemove);
        removePanel.add(selectRemove);
        //-------------------------------------------


        //--------------------south----------------------
        Button black = new Button("검정색");
        Button red = new Button("빨간색");
        Button  blue = new Button("파란색");

        black.addActionListener(new ColorHandler());
        red.addActionListener(new ColorHandler());
        blue.addActionListener(new ColorHandler());
        colorPanel.add(black);
        colorPanel.add(red);
        colorPanel.add(blue);
        //--------------------------------------


// ---------------------------FRAME에 판넬추가------------------------------------------
        add(line, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
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


    class ColorHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("검정색")) {
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


    class FigureHandler implements ActionListener {

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


}



