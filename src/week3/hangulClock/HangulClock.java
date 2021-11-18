package week3.hangulClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HangulClock {
    private int hour = 0;
    private int minute = 0;
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    String[][] hangulClockArr;

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


    public void timeFormatter() {
        LocalDateTime dateTime = LocalDateTime.now();
        this.hour = dateTime.getHour();
        this.minute =dateTime.getMinute();
    }

    public void checkClcokHour() {
        timeFormatter();  //현재시간  hour11
        int changeHour = hour%12;
   //     System.out.println(hour);
        HourData[] hourData = HourData.values();  // enum 정보
//        for(int i=0; i<hourData.length; i++){
//            System.out.println(hourData[i]);
//        }
        MinuteData[] minuteData = MinuteData.values() ;
        hangulClockArr = clock;
        //   String[][] backgroundClockArr = clockBackground();
        createHangulClockHour(hourData, hangulClockArr, changeHour);
        createHangulClockMinute(minuteData,hangulClockArr,minute);
        printHangulClock();
    }



    private void createHangulClockHour(HourData[] hourData, String[][] hangulClockArr, int hour) {
        clock[2][5] = ANSI_CYAN + "시" + ANSI_RESET;
        for (HourData hd : hourData) {
            if (hd.getHour() == hour) {
                hangulClockArr[hd.getRow()][hd.getColumn()] = ANSI_CYAN + hd.getHangul() + ANSI_RESET;
            }
        }
    }

    private void createHangulClockMinute(MinuteData[] minuteData, String[][] hangulClockArr, int minute) {
        clock[5][5] = ANSI_CYAN + "분" + ANSI_RESET;
        for (MinuteData md : minuteData){
            if(md.getMinute() == minute){
                hangulClockArr[md.getRow()][md.getColumn()] = ANSI_CYAN + md.getHangul() + ANSI_RESET;
            }
        }
    }



    private void printHangulClock() {
        for (int i = 0; i < hangulClockArr.length; i++) {
            for (int j = 0; j < hangulClockArr[i].length; j++) {
                System.out.printf(hangulClockArr[i][j]);
            }
            System.out.println();
        }
    }
}
