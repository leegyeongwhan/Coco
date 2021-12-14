package AlgorithmSolving.Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Step1_06 {
  public int solution(long num) {
    int answer = 0;
    int count = 0;
    while (num != 1) {
      if (num % 2 == 0) {
        num = num / 2;
      } else {
        num = num * 3 + 1;
      }
      count++;
      if (count == 500) {
        count = -1;
        break;
      }
    }
    answer = count;
    return answer;
  }

  public static void main(String[] args) {
    Step1_06 Step1_06 = new Step1_06();
    System.out.println(Step1_06.solution(626331));
  }
}

