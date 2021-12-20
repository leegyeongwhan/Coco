package AlgorithmSolving.Programmers;

import java.nio.charset.StandardCharsets;

public class Step1_10 {
  public String solution(String s, int n) {
    String answer = "";
    char ch;
    int a;
    for (int i = 0; i < s.length(); i++) {
      ch = s.charAt(i);
      a = (int) ch;
      System.out.println(a);
      if (65 <= a && a <= 90) {  //대문자
        if (n + (int) ch > 90) {
          a = (int) ch - 26 + n;
        } else {
          a = (int) ch + n;
        }
      }
      if (97 <= a && a <= 122) {  //소문자
        if (n + (int) ch > 122) {
          a = (int) ch - 26 + n;
        } else {
          a = (int) ch + n;
        }
      }
      ch = (char) a;
      answer += ch;
    }
    return answer;
  }

  public static void main(String[] args) {
    Step1_10 Step1_10 = new Step1_10();
    System.out.println(Step1_10.solution("Z", 1));


  }
}


