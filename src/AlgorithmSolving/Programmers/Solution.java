package AlgorithmSolving.Programmers;

import java.util.*;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> hs  = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }

        return hs.stream().sorted().mapToInt(Integer::intValue).toArray();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                int num = numbers[i] + numbers[j];
//                if (list.indexOf(num) < 0) {
//                    list.add(num);
//                }
//            }
//        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        Arrays.sort(answer);

    }

    public static void main(String[] args) {


        int[] num = new int[]{2, 1, 3, 4, 1};
        Solution s = new Solution();
        System.out.println(Arrays.toString(num));
        s.solution(num);

    }
}
