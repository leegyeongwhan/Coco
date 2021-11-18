package week3.hangulClock;

public enum MinuteData {

    ONE("이", 20, 3, 1),
    THREE("삼", 30, 3, 2),
    FOUR("사", 40, 3, 3),
    FIVE("오", 50, 3, 4),
    IL("일", 1, 4, 1),
    E("이", 2, 4, 2),
    SAM("삼", 3, 4, 3),
    SA("사", 4, 4, 4),
    SIX("육", 6, 4, 5),
    O("오", 5, 5, 1),
    SEVEN("칠", 7, 5, 2),
    PAL("팔", 8, 5, 3),
    NINE("구", 9, 5, 4),

    ;
    private String hangul;
    private int minute;
    private int row;
    private int column;

    MinuteData(String hangul, int minute, int row, int column) {
        this.hangul = hangul;
        this.minute = minute;
        this.row = row;
        this.column = column;
    }

    public String getHangul() {
        return hangul;
    }

    public int getMinute() {
        return minute;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }


}
