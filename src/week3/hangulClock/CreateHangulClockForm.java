package week3.hangulClock;

public class CreateHangulClockForm {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";


    void createHangulClockHour(HourData[] hourData, String[][] hangulClockArr, int hour) {
        hangulClockArr[2][5] = ANSI_CYAN + "시" + ANSI_RESET;
        int changeHour = hour % 12;
        if (hour == 0) {
            for (HourData hd : hourData) {
                if (hd.getHour() == hour) {
                    hangulClockArr[hd.getRow()][hd.getColumn()] = ANSI_CYAN + hd.getHangul() + ANSI_RESET;
                }
            }
        }
        if (hour > 12) {
            for (HourData hd : hourData) {
                if (hd.getHour() == changeHour) {
                    hangulClockArr[hd.getRow()][hd.getColumn()] = ANSI_CYAN + hd.getHangul() + ANSI_RESET;
                }
            }
        }
        if (hour < 12) {
            for (HourData hd : hourData) {
                if (hd.getHour() == hour) {
                    hangulClockArr[hd.getRow()][hd.getColumn()] = ANSI_CYAN + hd.getHangul() + ANSI_RESET;
                }
            }
        }

    }

    void createHangulClockTenMinute(MinuteData[] minuteData, String[][] hangulClockArr, int minute) {  //10분넘는 분
        hangulClockArr[5][5] = ANSI_CYAN + "분" + ANSI_RESET;
        int changeMinute1 = minute % 10;
        int tenchangeMinute = minute - (changeMinute1);
//        int changeMinute2 = minute / 10;
        if (minute > 10) {
            hangulClockArr[3][5] = ANSI_CYAN + "십" + ANSI_RESET;
            for (MinuteData md : minuteData) {
                if (md.getMinute() == changeMinute1) {
//                    hangulClockArr[md.getRow()][md.getColumn()] = ANSI_CYAN + md.getHangul() + ANSI_RESET;
//                }
                    if (md.getMinute() == tenchangeMinute) {
                        hangulClockArr[md.getRow()][md.getColumn()] = ANSI_CYAN + md.getHangul() + ANSI_RESET;
                    }
                }
            }

        }

    }  ////// 여기를 두개의 메서드로 나눌수있을까?

    public void createHangulClockOneMinute(MinuteData[] minuteData, String[][] hangulClockArr, int minute) {
        hangulClockArr[5][5] = ANSI_CYAN + "분" + ANSI_RESET;
        if (minute < 10) {
            for (MinuteData md : minuteData) {
                if (md.getMinute() == minute) {
                    hangulClockArr[md.getRow()][md.getColumn()] = ANSI_CYAN + md.getHangul() + ANSI_RESET;
                }
            }
        }
    }

}
