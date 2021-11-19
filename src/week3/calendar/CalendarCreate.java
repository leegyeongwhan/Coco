package week3.calendar;

import week2.rpg.Player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarCreate {
    private final int[] MONTHARR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] LEAPYEAR_MONTHARR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] WEEK = {"월", "화", "수", "목", "금", "토", "일"};
//
//    private int month = 0;
//    private int year = 0;


    public void runCalendar() {

        getCurrentTime();
        //  dayOfWeek();
//        buildCurrentCalendar();
//        printCalendar();
        buildCurrentCalendar();

    }

    private int[] getCurrentTime() {  //현재 달과 년도 계산
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        calendar.set(Calendar.DAY_OF_MONTH, 1);  //달의 1일구하기
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int[] currentYearMonth = {currentYear, currentMonth, dayOfWeek};
        return currentYearMonth;
    }

    private void buildCurrentCalendar() {
        int year = getCurrentTime()[0];
        int month = getCurrentTime()[1];
        System.out.println(month);
        int dayofweek = getCurrentTime()[2];
        int maxday = 0;
        if (isLeapYear(year)) {
            if (month == 2) {
                maxday = LEAPYEAR_MONTHARR[month - 1];
            }

        } else {
            maxday = MONTHARR[month - 1];
        }

        currentPrintCalendar(year, month, maxday, dayofweek);

    }

    private void currentPrintCalendar(int year, int month, int maxday, int dayofweek) {  //2021 11 29 2
        System.out.println("오늘 날짜는 " + year + "년" + month + "월");
        printWeek();
        for (int i = 1; i < dayofweek; i++) {
            System.out.print("*");
            System.out.print("\t");
        }
        for (int i = 1; i <= maxday; i++) {
            System.out.print(i);
            System.out.print("\t");
            if(dayofweek%7==0){
                System.out.println();
            }
            dayofweek++;
        }
    }


    private boolean isLeapYear(int year) {
        int leapYear;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년입니다");
            return true;
        } else {
            System.out.println("아닙니다");
            return false;
        }
    }

    private int dayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd", Locale.KOREA);
        String today = formatter.format(currentTime);
        System.out.println("<오늘 날짜는 " + today + "입니다>");
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
        return dayOfWeek;  //6


    }


    private void printWeek() {
        System.out.println("----------------------");
        for (int i = 0; i < WEEK.length; i++) {
            System.out.printf(WEEK[i]);
            System.out.print("\t");
        }
        System.out.println();
    }
}
