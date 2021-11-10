package AlgorithmSolving;

import java.util.Scanner;

class Leapyear2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leapyear = scanner.nextInt();
        scanner.close();
//        long test = 2012;
//        if(leapyear%4==0){
//            if(leapyear%400==0){
//                System.out.println("1");
//            }
//            else if (leapyear%100==0){
//                System.out.println("0");
//            }
//        }


        if ((leapyear % 4 == 0 && leapyear % 100 != 0) || leapyear % 400 == 0) {  //4의배수
            System.out.println("1");
        } else
            System.out.println("0");

    }
}
