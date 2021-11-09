package week1.gugudan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> countDan = PromptDan.input();
        Dan dan = Dan.of(countDan);
        PromptDan.danPrint(dan);
    }
}
