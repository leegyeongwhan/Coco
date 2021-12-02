package AlgorithmSolving.Programmers;

import java.util.Locale;

public class Step1_01 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] .equals(" ") ) {
                count = 0;
            } else if (count % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                count++;
            } else if (count % 2 != 0) {
                arr[i] = arr[i].toLowerCase();
                count++;
            }
            answer = answer + arr[i];
        }
        return answer;
    }

}
