package AlgorithmSolving.Programmers;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public String solution(int a, int b) {
        final String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU",};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        String answer ="";
        for (int i = 0; i < a-1; i++) {
            sum += date[i];  //날짜 계산
        }

        sum += (b-1);  //시작일이 1월1일니까 1일뺴자

        answer = day[sum%7];
       // System.out.println(answer);
//        List<String> list = new ArrayList<>();
//

//        System.out.println(sum);a

//        System.out.println(sum);
//        for (int j = 0; j < sum; j++) {
//            list.add(day[j]);
//
//        }
//
//        System.out.println(list.get(list.size() - 1));
//        String lastindex = list.get(list.size() - 1);
//        String answer = lastindex;

            return answer ;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.solution(5, 24);
    }
}