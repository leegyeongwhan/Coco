package AlgorithmSolving.Programmers;

public class Step1_08 {
  public boolean solution(int x) {
    boolean answer;
    int sum = 0;
    int x1 = x;
    while (x1 != 0) {
      sum = sum + (x1 % 10);
      x1 = x1 / 10;
    }
    if (x % sum == 0) {
      answer = true;
    } else {
      answer = false;
    }
    return answer;
  }

  public static void main(String[] args) {
    Step1_08 Step1_06 = new Step1_08();
      //System.out.println(Step1_06.solution(10));
    int sum = 0;
    int x1 = 0;
    int x = 10;
    while (x != 0) {
      sum = sum + (x % 10);
      x = x / 10;
    }
    System.out.println(sum);
    System.out.println(x);

  }
}


