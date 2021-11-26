package AlgorithmSolving.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        long sum = 0;
        if (x == 0) {
            return 0;
        }
        while (x != 0) {
            result = result * 10 + (x % 10);
            x = x / 10;
        }
        double MIN_32BIT_INT = Math.pow( -2, 31 );
        double MAX_32BIT_INT = Math.pow(  2, 31 ) - 1;
        if( result < MIN_32BIT_INT || MAX_32BIT_INT < result ){
            return 0;
        }
        return (int)result;

    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();

        System.out.println(r.reverse(-123));
    }
}
