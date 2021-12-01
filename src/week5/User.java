package week5;

import java.util.Scanner;

public class User {

    public void insertCoin() {
        Scanner scanner =  new Scanner(System.in);
        Wallet wallet  = new Wallet();
        System.out.println("돈을 넣어주세요");
        wallet.setMoney(scanner.nextInt());

    }


}
