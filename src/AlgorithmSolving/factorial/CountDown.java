package AlgorithmSolving.factorial;

public class CountDown {
    public static void main(String[] args) {

        {
            Function(5);
        }


    }

    public static void Function(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            Function(num - 1);
        }
    }
}
