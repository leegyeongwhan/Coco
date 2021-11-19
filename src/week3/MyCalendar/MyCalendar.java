package week3.MyCalendar;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

    int year;
    int month;
    int startDay;
    int lastDay;

    public void setCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        this.year = year;
        this.month = month;
        this.startDay = calendar.get(calendar.DAY_OF_WEEK);
        this.lastDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
    }

    public void initDate() {  //현재의달
        LocalDate myDate = LocalDate.now();
        String[] dateArray = myDate.toString().split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        setCalendar(year, month);
    }


    public void run() {
        initDate();
        printCalander();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("1입력, 2종료");
            int go = scanner.nextInt();
            switch (go) {
                case 1:
                    takeUserInput(scanner);
                    printCalander();
                    break;
                case 2:
                    flag = false;
                    break;
            }
        }
    }

    public void printCalander() {
        System.out.println("현재 날짜는" + year + "년" + month + "월");
        System.out.println("일  월  화  수   목   금   토");
        for (int i = 1; i < startDay; i++) {
            System.out.print(" ");
            System.out.print("\t");
        }
        for (int i = 1; i <= lastDay; i++) {
            System.out.print(i);
            System.out.print("\t");
            if (startDay % 7 == 0) {
                System.out.println();
            }
            startDay++;
        }
        System.out.println();
    }

    public void takeUserInput(Scanner scanner) {
        System.out.println("년도");
        int year = scanner.nextInt();
        System.out.println("달");
        int month = scanner.nextInt();
        setCalendar(year, month);
    }

}

