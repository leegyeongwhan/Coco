package AlgorithmSolving.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step1_05 {
  public int[] solution(int[] arr) {
    int[] answer = {};
    Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    ArrayList<Integer> sublist = new ArrayList<>(Arrays.asList(arr3));
    int min = arr[0];
    int[] arr1 = {-1};
    if (arr.length == 1) {
      return arr1;
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (min > arr[i]) {
          min = arr[i];
        }
      }
      sublist.remove(Integer.valueOf(min));
    }

    int[] ret = new int[sublist.size()];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = sublist.get(i).intValue();
    }

    return ret;
  }

//  public static void main(String[] args) {
//    Step1_05 Step1_05 = new Step1_05();
//    Step1_05.solution(new int[]{4, 3, 2, 1});
//  }
}
