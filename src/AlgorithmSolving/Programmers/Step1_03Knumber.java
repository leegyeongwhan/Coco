package AlgorithmSolving.Programmers;

import java.awt.*;
import java.util.Arrays;

public class Step1_03Knumber {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    int[] str;
    int a = 0;
    for (int i = 0; i < commands.length; i++) {
      str = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(str);
      a = str[commands[i][2] - 1];
      answer[i] = a;
    }
    return answer;
  }

  public static void main(String[] args) {
    Step1_03Knumber step1_03Knumber = new Step1_03Knumber();
    step1_03Knumber.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
  }
}
