package AlgorithmSolving.factorial;

public class CountDown1 {
    public static void main(String[] args) {

        System.out.println(Function(5));

    }

    public static int Function(int num) {
        if(num==1){
            return 1;
        }
        return num * Function(num-1);

    }


}