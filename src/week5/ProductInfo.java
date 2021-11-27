package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductInfo {
    private int number = 0;
    private String name = "";
    private int price = 0;
    private int count = 0;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "ProductInfo{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }


}
