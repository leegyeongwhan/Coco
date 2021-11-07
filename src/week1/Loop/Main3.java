package week1.Loop;

import java.util.Scanner;

class Main3 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         int sum = 0;
         String str = scanner.next();

         for(int i=0; i<num; i++){
             sum += Integer.parseInt(str.substring(i,i+1));
         }
         System.out.println(sum);

     }
 }