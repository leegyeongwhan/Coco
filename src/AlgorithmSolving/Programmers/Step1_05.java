package AlgorithmSolving.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Step1_05 {
  public int[] solution(Integer[] arr) {
    int[] answer = new int[arr.length];
    int[] answer1 = new int[arr.length - 1];
    Arrays.sort(arr, Collections.reverseOrder());
    for (int x : arr) {
      answer1[x] = arr[x];
      System.out.println(answer1[x]);
    }
    return answer1;
  }

//  public static void main(String[] args) {
//    Step1_05 Step1_05 = new Step1_05();
//    Step1_05.solution(new int[]{4, 3, 2, 1});
//  }
}
