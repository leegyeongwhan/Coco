package week1.star;

import java.util.Scanner;

class star1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            for (int j=i; j<4; j++){
                System.out.printf(" ");
            }
            for(int z=0; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
