package week5;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class ProductManager {
    private List<ProductInfo> productList = new ArrayList<ProductInfo>();
    private int productNumber = 0; //물품 입력될때마다 가지는 개인 번호


    public List<ProductInfo> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductInfo> productList) {
        this.productList = productList;
    }

    public void ProductInfoInsert(ProductInfo productInfo) {
        try {
            productInfo.setNumber(++this.productNumber);
            productList.add(productInfo);
        } catch (Exception e) {
            System.out.println("입력 오류" + e.getMessage());
        }
    }

    public void ProductInfoUpdat(int number) {
        try {
            for (int i = 0; i < this.productList.size(); i++) {
                ProductInfo pn = this.productList.get(i);
                //      System.out.println(pn);
                if (number == pn.getNumber()) {
                    this.productList.remove(i);
                    this.productList.add(i, productMakeInfo());
                    System.out.println("수정이 완료 되었습니다");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("수정 실패");
        }
    }


    public void ProductInfoDelete(int number) {  //1
        try {
            for (int i = 0; i < this.productList.size(); i++) {
                ProductInfo pn = this.productList.get(i);  //인덱스를 하나씩 담아서 비교
                //      System.out.println(pn);
                if (number == pn.getNumber()) {
                    this.productList.remove(i);  //
                    System.out.println("삭제가 완료 됐습니다");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("삭제중 에러 발생");
        }

    }

    public void ProductInfoView() {
        System.out.println("--------------------------------");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("번호:" + this.productList.get(i).getNumber());
            System.out.println("제품명:" + this.productList.get(i).getName());
            System.out.println("가격:" + this.productList.get(i).getPrice());
            System.out.println("수량:" + this.productList.get(i).getCount());
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    public ProductInfo productMakeInfo() {
        Scanner scanner = new Scanner(System.in);
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
