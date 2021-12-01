package week5;

import java.util.Scanner;

public class VmPrint {
    private Scanner scanner = new Scanner(System.in);
    private ProductManager pm;
    private ProductFile pf;

    public void managerMenuPrint() {
        pm = new ProductManager();
        pf = new ProductFile();
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
                    pm.setProductList(pf.readProductFile());
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


    public void userMenuPrint() {
        boolean power = true;
        pm = new ProductManager();
        pf = new ProductFile();
        pm.setProductList(pf.readProductFile());
        User user = new User();
        while (power) {
            switch (scanner.nextInt()) {
                case 1:
                    pm.ProductInfoView();
                    break;
                case 2:
                    user.insertCoin();
                    break;
                case 3:
                    power = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
        }
    }


}
