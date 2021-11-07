package week1.Loop;

import java.util.Scanner;

class Main2 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int input  = scanner.nextInt();
         for (int i = 0; i < input; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.printf("*");
             }
             System.out.println();
         }
     }
 }