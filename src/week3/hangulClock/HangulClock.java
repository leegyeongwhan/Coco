package week3.hangulClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class HangulClock {
    private int hour = 0;
    private int minute = 0;
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    String[][] hangulClockArr = new String[][]
            {{"한", "두", "세", "네", "다", "섯"},
                    {"여", "섯", "일", "곱", "여", "덟"},
                    {"아", "홉", "열", "한", "두", "시"},
                    {"자", "이", "삼", "사", "오", "십"},
                    {"정", "일", "이", "삼", "사", "육"},
                    {"오", "오", "칠", "팔", "구", "분"}};

//    private String[][] clockBackground() {
//        String[][] cb = new String[6][6];
//        for (int i = 0; i < cb.length; i++) {
//            for (int j = 0; j < cb[i].length; j++) {
//                cb[i][j] = "*";
//            }
//
//        }
//        return cb;
//    }


//    public String[][] clockSetting() {
//        for (int i = 0; i < clock.length; i++) {
//            for (int j = 0; j < clock[i].length; j++) {
//                System.out.printf(clock[i][j]);
//            }
//            System.out.println();
//
//        }
//        return clockSetting();
//    }

    public void runTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runHagulClock();
            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long intervalPeriod = 5000;
        timer.scheduleAtFixedRate(task, delay, intervalPeriod);
    }



    public void timeFormatter() {
        LocalDateTime dateTime = LocalDateTime.now();
        this.hour = dateTime.getHour();
        this.minute = dateTime.getMinute();
    }

    public void runHagulClock() {
        timeFormatter();  //현재시간  hour11
        int changeHour = hour % 12;
        //     System.out.println(hour);
        HourData[] hourData = HourData.values();  // enum 정보
        MinuteData[] minuteData = MinuteData.values();
        CreateHangulClockForm cf = new CreateHangulClockForm();
        cf.createHangulClockHour(hourData, hangulClockArr, changeHour);
        cf.createHangulClockOneMinute(minuteData, hangulClockArr, minute);
        cf.createHangulClockTenMinute(minuteData, hangulClockArr, minute);
        midnightDivision(hangulClockArr, hour);
        printHangulClock();
    }


//    private void createHangulClockTenMinute(){
//
//    }


    private void printHangulClock() {
        for (int i = 0; i < hangulClockArr.length; i++) {
            for (int j = 0; j < hangulClockArr[i].length; j++) {
                System.out.printf(hangulClockArr[i][j]);
            }
            System.out.println();
        }
    }

    private void midnightDivision(String[][] hangulClockArr, int hour) {
        if (hour == 24) {
            hangulClockArr[3][0] = ANSI_CYAN + "자" + ANSI_RESET;
            hangulClockArr[4][0] = ANSI_CYAN + "정" + ANSI_RESET;
        }
        if (hour == 12) {
            hangulClockArr[4][0] = ANSI_CYAN + "정" + ANSI_RESET;
            hangulClockArr[5][0] = ANSI_CYAN + "오" + ANSI_RESET;
        }
    }
}
