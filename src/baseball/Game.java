package baseball;

import java.util.*;

public class Game {



    private String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 ex)123 :");
        String inputNumber = scanner.next();
        while (inputNumber.length() != 3) {
            System.out.println("다시 입력해주세요");
            inputNumber = scanner.next();
        }
        return inputNumber;
    }

    private String[] checkInputNumber() {
        String[] checkNumber = inputNumber().split("");
        return checkNumber;
    }


    private List<String> computerNumberSuffle() {
        String[] numberArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List<String> list = Arrays.asList(numberArray);
        Collections.shuffle(list);
        return list;
    }

    private String[] checkComputerNumber() {
        String[] computerNumberList = new String[3];
        List<String> list;
        list = computerNumberSuffle();
        for (int i = 0; i < computerNumberList.length; i++) {
            computerNumberList[i] = list.get(i);
        }
        return computerNumberList;
    }



    public void startGame() {
        //  System.out.println(Arrays.toString(checkComputerNumber()));
        String[] checkPlNum = checkInputNumber();
        String[] checkComNum = checkComputerNumber();
        resultGame(checkPlNum,checkComNum);
        System.out.println(Arrays.toString(checkComNum));
        System.out.println(Arrays.toString(checkPlNum));
    }

    private void resultGame(String[] checkPlNum, String[] checkComNum) {

    }
}
