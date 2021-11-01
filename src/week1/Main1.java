package week1;

import java.util.Scanner;

class Main1 {


    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println( (num>=90) ? "A" : (num>=80) ? "B" : (num>=70) ? "C" : (num>=60) ? "D" : "F");

    }
}
