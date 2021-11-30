package week5;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class ProductManager {
    private List<ProductInfo> productList = new ArrayList<ProductInfo>();
    private int productNumber = 0; //물품 입력될때마다 가지는 개인 번호

    public void ProductInsert(ProductInfo productInfo) {
        try {
            productInfo.setNumber(this.productNumber++);
            productList.add(productInfo);
        } catch (Exception e) {
            System.out.println("입력 오류" + e.getMessage());
        }

    }

    public void ProductUpdat() {

    }

    public void ProductDelete() {

    }

    public void ProductView() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

}
