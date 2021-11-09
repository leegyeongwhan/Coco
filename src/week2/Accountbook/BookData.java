package week2.Accountbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookData {
    private  int number = 0;
    private  int date;
    private  int incom;
    private  int outlay;
    private  String summary;
//    private static List<String> accountbook = new ArrayList<>();

    public void setNumber(int number) {

        this.number = number ;
    }

    public void setdate(int date) {
        this.date = date;
    }

    public void setincom(int incom) {
        this.incom = incom;
    }

    public void setoutlay(int outlay) {
        this.outlay = outlay;
    }

    public void setsummary(String summary) {
        this.summary = summary;
    }

    public int getDate() {
        return this.date;
    }

    public int getIncom() {
        return this.incom;
    }

    public int getOutlay() {
        return this.outlay;
    }

    public String getSummary() {
        return this.summary;
    }

    public int getNumber() {

        return this.number;
    }


    public String toString() {
        return this.getNumber() + this.getDate() + this.getSummary() + this.getIncom() + this.getOutlay() + "";
    }
}
