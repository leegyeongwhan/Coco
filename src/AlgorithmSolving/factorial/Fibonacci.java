package AlgorithmSolving.factorial;

public class Fibonacci {


    private static int sum;


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int num) {
        if (num <= 1) {
            return 1;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);


    }

}
