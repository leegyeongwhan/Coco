package AlgorithmSolving.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Step1_11 {
  public String solution(String s) {
    String answer = "";
    String[] arr = s.split("");
    Arrays.sort(arr, Collections.reverseOrder());
    answer = String.join("", arr);
    return answer;
  }

  public static void main(String[] args) {
    Step1_11 Step1_06 = new Step1_11();
    Step1_06.solution("Zbcdefg");
  }
}


