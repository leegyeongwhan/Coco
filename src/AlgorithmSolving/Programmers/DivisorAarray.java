package AlgorithmSolving.Programmers;

import java.util.*;

class DivisorArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        //  System.out.println(arr.length);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }

        }
        if (list.isEmpty()) {
            list.add(-1);
        }

        answer = new int[list.size()];


        //  System.out.println(answer.length);
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
//          for(int i=0;  i<answer.length; i++){
//              System.out.println(answer[i]);
//        }
        Arrays.sort(answer);
        return answer;
    }

}