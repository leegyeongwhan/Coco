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
            productInfo.setNumber(this.productNumber++);
            productList.add(productInfo);
        } catch (Exception e) {
            System.out.println("입력 오류" + e.getMessage());
        }
    }

    public void ProductInfoUpdat() {

    }

    public void ProductInfoDelete() {

    }

    public void ProductInfoView() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

}
