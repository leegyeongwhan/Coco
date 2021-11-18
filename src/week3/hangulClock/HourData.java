package week3.hangulClock;

public enum HourData {

    ONE("한", 1, 0, 0),
    TWO("두", 2, 0, 1),
    THREE("세", 3, 0, 2),
    FOUR("네", 4, 0, 3),
    FIVE("다섯", 5, 0, 4),
    SIX("여섯", 6, 1, 0),
    SEVEN("일곱", 7, 1, 2),
    EIGHT("여덟", 8, 1, 2),
    NINE("아홉", 9, 2, 3),
    TEN("열", 10, 3, 0),
    ELEVEN("열하나", 11, 4, 0),
    TWELVE("열둘", 12, 5, 0);

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



