package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VmOrder {

    List<ProductInfo> lp = new ArrayList<ProductInfo>();

    public void menu() {
        VmPrint vm = new VmPrint();
        Scanner scanner = new Scanner(System.in);
        boolean fleg = true;
        while (fleg) {
            System.out.println("사용자 1, 관리자 2");
            int power = scanner.nextInt();
            switch (power) {
                case 1:
                    break;
                case 2:
                    vm.menuPrint();
                    break;
            }
        }
    }
}
