package week1.gugudan;

import java.util.List;

public class Dan {
    //단 검사
    private final int start;
    private final int end;

    public Dan(List<Integer> countDan) {
        this.start = Math.min(countDan.get(0), countDan.get(1));
        this.end = Math.max(countDan.get(0), countDan.get(1));

    }

    public static Dan of(List<Integer> countDan) {
        return new Dan(countDan);
    }

    public int getstardan() {
        return start;
    }

    public int getenddan() {
        return end;
    }
}