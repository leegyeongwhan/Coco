package week5;

import java.util.Scanner;

public class VmPrint {
    private Scanner scanner = new Scanner(System.in);

    public void menuPrint() {
        ProductManager pm = new ProductManager();

        boolean fleg = true;
        while (fleg) {
            System.out.println("출력1,입력2,수정3,삭제4,종료5");
            int power = scanner.nextInt();
            switch (power) {
                case 1:
                    pm.ProductView();
                    break;
                case 2:
                    pm.ProductInsert(productMakeInfo());
                    break;
                case 3:
                    pm.ProductUpdat();
                    break;
                case 4:
                    pm.ProductDelete();
                    break;
                case 5:
                    fleg = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
        }
    }

    public ProductInfo productMakeInfo() {
        scanner.reset();
        ProductInfo pi = new ProductInfo();
        System.out.println("제품명");
        pi.setName(scanner.next());
        System.out.println("가격");
        pi.setPrice(scanner.nextInt());
        System.out.println("수량");
        pi.setCount(scanner.nextInt());
        return pi;
    }
}
