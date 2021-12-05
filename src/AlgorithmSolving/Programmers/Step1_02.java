package AlgorithmSolving.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step1_02 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = tmp * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Step1_02 s = new Step1_02();

        //    System.out.println(s.solution(2,5));

//        int sum = 0;
//        long[] answer = {};
//        int n = 5;
//        int x = 2;
//        int i = 0;
//        long[] arr = new long[n];
//        while (n > 0) {
//            sum += x;
//            System.out.println(sum);
//            arr[i] = sum;
//            System.out.println(arr[i]);
//            i++;
//            n--;
 //       }
    }
}
