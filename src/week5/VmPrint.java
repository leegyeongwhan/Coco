package week5;

import java.util.Scanner;

public class VmPrint {

    public void menu() {
        Product p = new Product();
        Scanner scanner = new Scanner(System.in);
        boolean fleg = true;
        while (fleg) {
            System.out.println("출력1,입력2,수정3,삭제4,종료5");
            int power = scanner.nextInt();
            switch (power) {
                case 1:
                    p.ProductView();
                    break;
                case 2:
                    p.ProductInsert();
                    break;
                case 3:
                    p.ProductUpdat();
                    break;
                case 4:
                    p.ProductDelete();
                    break;
                case 5:
                    fleg=false;
                    break;
            }
        }
    }
}
