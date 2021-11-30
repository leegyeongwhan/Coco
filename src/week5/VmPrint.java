package week5;

import java.util.Scanner;

public class VmPrint {
    private Scanner scanner = new Scanner(System.in);

    public void menuPrint() {
        ProductManager pm = new ProductManager();
        ProductFile pf = new ProductFile();
        boolean fleg = true;
        while (fleg) {
            System.out.println("출력1,입력2,수정3,삭제4, 파일저장5 ,파일 불러오기6,종료7");
            int power = scanner.nextInt();
            switch (power) {
                case 1:
                    pm.ProductInfoView();
                    break;
                case 2:
                    pm.ProductInfoInsert(pm.productMakeInfo());
                    break;
                case 3:
                    System.out.println("수정할 번호를 입력하세요");
                    pm.ProductInfoUpdat(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("삭제할 번호를 입력하세요");
                    pm.ProductInfoDelete(scanner.nextInt());
                    break;
                case 5:
                    pf.writeProductFile(pm.getProductList());
                    break;
                case 6:
                    break;
                case 7:
                    fleg = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
        }
    }


}
