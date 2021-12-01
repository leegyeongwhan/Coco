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

        Panel removePanel = new Panel();
        Panel figurePanel = new Panel();

        figurePanel.setLayout(new GridLayout(2, 2));
        removePanel.setLayout(new GridLayout(1, 1));
        setLayout(new BorderLayout());
//-----------------------------NORTH--------------------------
        Panel northPanel = new Panel();
        northPanel.setBackground(Color.lightGray);
        CheckboxGroup lineCheckbox = new CheckboxGroup();
        Checkbox line = new Checkbox("직선", lineCheckbox,true);
        Checkbox curve = new Checkbox("곡선",lineCheckbox, true);

        line.addItemListener(new LineHandler());
        curve.addItemListener(new LineHandler());
        // -----------------------------------------------------------

        //---------------------west-----------------------



        Button square = new Button("사각형");
        Button circle = new Button("원");

        square.addActionListener(new FigureHandler());
        circle.addActionListener(new FigureHandler());



        //-------------------------------------------


        //-------east------------------------
        Button  allRemove = new Button("allRemove");
        Button  selectRemove = new Button("selectRemove");



        //-------------------------------------------


        //--------------------south----------------------
        Panel colorPanel = new Panel();
        colorPanel.setBackground(Color.lightGray);
        CheckboxGroup colorCheckbox = new CheckboxGroup();
        Checkbox black = new Checkbox("검은색", colorCheckbox, true);
        Checkbox red = new Checkbox("빨간색", colorCheckbox, false);
        Checkbox blue = new Checkbox("파란색", colorCheckbox, false);

        black.addItemListener(new ColorHandler());
        red.addItemListener(new ColorHandler());
        blue.addItemListener(new ColorHandler());

        //--------------------------------------


// ---------------------------FRAME에 판넬추가------------------------------------------

        northPanel.add(line);
        northPanel.add(curve);
        figurePanel.add(square);
        figurePanel.add(circle);
        colorPanel.add(black);
        colorPanel.add(red);
        colorPanel.add(blue);
        removePanel.add(allRemove);
        removePanel.add(selectRemove);

        add(northPanel, "North"); // f.add("North",north); . 와 같이 쓸 수도 있다
        add(colorPanel, "South"); // South의 대소문자 정확히
        add(removePanel, "East"); // East , BorderLayout.EAST 대신 사용가능
        add(figurePanel, "West");

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

    class ColorHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem().equals("검은색")) {
                isBlack = true;
                isRed = false;
                isBlue = false;
            }
            if (e.getItem().equals("빨간색")) {
                isBlack = false;
                isRed = true;
                isBlue = false;
            }
            if (e.getItem().equals("파란색")) {
                isBlack = false;
                isRed = false;
                isBlue = true;
            }
        }
    }

    private class LineHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem().equals("직선")) {
                isLine = true;
                isRect = false;
                isCir = false;
                isCuv = false;
            }
            if (e.getItem().equals("곡선")) {
                isLine = false;
                isRect = false;
                isCir = false;
                isCuv = true;
            }

        }
    }


}



