package week3.hangulClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HangulClock {
    private int hour = 0;
//    String[][] hangulClock;
//    String[][] backGroundClock;

    public void runHangulCllock() {
        timeFormatter();

    }

    private final String[][] clock = new String[][]
            {{"한", "두", "세", "네", "다", "섯"},
                    {"여", "섯", "일", "곱", "여", "덟"},
                    {"아", "홉", "열", "한", "두", "시"},
                    {"자", "이", "삼", "사", "오", "십"},
                    {"정", "일", "이", "삼", "사", "육"},
                    {"오", "오", "칠", "팔", "구", "분"}};

    private String[][] clockBackground() {
        String[][] cb = new String[6][6];
        for (int i = 0; i < cb.length; i++) {
            for (int j = 0; j < cb[i].length; j++) {
                cb[i][j] = "*";
            }

        }
        return cb;
    }


    public String[][] clockSetting() {
        for (int i = 0; i < clock.length; i++) {
            for (int j = 0; j < clock[i].length; j++) {
                System.out.printf(clock[i][j]);
            }
            System.out.println();

        }
        return clockSetting();
    }


    private void timeFormatter() {
        LocalDateTime dateTime = LocalDateTime.now();
        this.hour = dateTime.getHour();

    }

    private void checkClcok() {
        timeFormatter();  //현재시간
        String[][] hanculClockArr = clockSetting();
        String[][] backgroundClockArr = clockBackground();
        crateHangulClock();
        printHangulClock();
    }

    private void crateHangulClock(){

    }

    private void printHangulClock(){

    }
}
