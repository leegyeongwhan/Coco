package week1.star;

import java.util.Scanner;

class star2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=0; i<num; i++) {

            for(int j=i+1; j<=num; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
