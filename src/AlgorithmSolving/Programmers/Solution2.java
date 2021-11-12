package AlgorithmSolving.Programmers;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Solution2 {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();

        int[] firstStudent = {1, 2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};


        for (int i = 0; i < answers.length; i++) {
            if (firstStudent[i % 5] == answers[i]) {
                count[0]++;
            }
            if (secondStudent[i % 8] == answers[i]) {
                count[1]++;
            }
            if (thirdStudent[i % 10] == answers[i]) {
                count[2]++;
            }
        }
        // System.out.println(Arrays.toString(count));
        int[] arr = new int[count.length];
        for (int i = 0; i < arr.length; i++) {
            if (count[i] > arr[i]) {
                arr[i] = count[i];
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (count[i] == arr[2]) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        //  System.out.println(arr[2]);


        return answer;
    }


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.solution(new int[]{5, 1, 3, 1, 5, 3});
    }
}