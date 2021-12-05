package baseball;

import java.util.*;

public class Game {

    private void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 ex)123 :");
        int checkInputNumber = scanner.next().length();
        while (checkInputNumber != 3) {
            System.out.println("다시 입력해주세요");
        }

    }

    private void checkInputNumber() {

    }



    private List<Integer> computerNumberSuffle() {
        Integer[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = Arrays.asList(numberArray);
        Collections.shuffle(list);
        return list;
    }

    private int[] checkComputerNumber() {
        int[] computerNumberList = new int[3];
        List<Integer> list;
        list = computerNumberSuffle();
        for (int i = 0; i < computerNumberList.length; i++) {
            computerNumberList[i] = list.get(i);
        }
        return computerNumberList;
    }


    private void player() {
        inputNumber();

    }


    public void startGame() {
        checkComputerNumber();  //123sd
      //  System.out.println(Arrays.toString(checkComputerNumber()));
    }
}
