package AlgorithmSolving.Programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Step1_13 {
  public int[] solution(int[] arr) {
    int[] answer = {};
    Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//    System.out.println(Arrays.stream(arr3).collect(Collectors.toList()));
    LinkedList<Integer> arr1 = new LinkedList<>(Arrays.asList(arr3));
    arr1.add(arr[0]);
    for(int i=1; i<arr.length;i++){
      if(arr[i]!=arr1.getLast()){
        arr1.add(arr[i]);
      }
    }
    System.out.println(arr1);

    return answer;
  }

  public static void main(String[] args) {
    Step1_13 Step1_06 = new Step1_13();
    Step1_06.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
  }


}


