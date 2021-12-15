package AlgorithmSolving.Programmers;

public class Step1_07 {
  public long solution(long num) {
    long answer = 0;
    if (Math.sqrt(num) % 1 != 0) {
      return -1;
    } else {
      answer = (long) Math.sqrt(num);
      answer = (answer + 1) * (answer + 1);
      return answer;
    }
  }

  public static void main(String[] args) {
    Step1_07 Step1_06 = new Step1_07();
    System.out.println(Step1_06.solution(121));
    System.out.println(Math.sqrt(121) % 1);
  }
}


