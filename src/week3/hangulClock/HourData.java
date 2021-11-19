package week3.hangulClock;

public enum HourData {

    ONE("한", 1, 0, 0),
    TWO("두", 2, 0, 1),
    THREE("세", 3, 0, 2),

    FOUR("네", 4, 0, 3),
    FIVE("다섯", 5, 0, 4),
    SIX1("여", 6, 1, 0),
    SIX2("섯", 6, 1, 1),
    SEVEN1("일", 7, 1, 2),
    SEVEN2("곱", 7, 1, 3),
    EIGHT1("여", 8, 1, 4),
    EIGHT2("덟", 8, 1, 5),
    NINE1("아", 9, 2, 0),
    NINE2("홉", 9, 2, 1),
    TEN("열", 10, 2, 2),
    ELEVEN_TEN("열", 11, 2, 2),
    ELEVEN("한", 11, 2, 3),
    TWELVE_TEN("열", 0, 2, 2),
    TWELVE("두", 0, 2, 4);

    private String hangul;
    private int hour;
    private int row;
    private int column;

    HourData(String hangul, int hour, int row, int column) {
        this.hangul = hangul;
        this.hour = hour;
        this.row = row;
        this.column = column;
    }

    public int getHour() {
        return this.hour;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public String getHangul() {
        return this.hangul;
    }
}



