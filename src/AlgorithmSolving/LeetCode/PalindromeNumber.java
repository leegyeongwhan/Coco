package AlgorithmSolving.LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {  // 12321
        if (x < 0) {
            return false;
        }

        int num = x;
        int tmp = 0;
        while (num>0) {
            tmp = tmp * 10 + num % 10;
            x /= 10;
        }

        return x == tmp;
    }
}
