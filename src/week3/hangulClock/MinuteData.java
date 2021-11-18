package week3.hangulClock;

public enum MinuteData {
    IL("일", 1, 3, 1),
    ONE("이", 2, 3, 2),
    TWO("삼", 3, 3, 3),
    THREE("사", 4, 3, 4),
    FOUR("오", 5, 3, 5),
    // FIVE("일", 5, 0, 4),
    //  SIX("이", 6, 1, 0),
//    SEVEN("삼", 7, 1, 2),
//    EIGHT("사", 8, 1, 2),
    NINE("육", 6, 4, 1),
    //    TEN("오", 10, 3, 0),
    ELEVEN("칠", 7, 4, 2),
    TWL("팔", 8, 4, 3),
    TREE("구", 9, 4, 4),

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
