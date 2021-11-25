package week2.Accountbook;

import java.io.*;

public class TestFileWrite {
    public static void main(String[] args) {


        try {
            OutputStream output = new FileOutputStream("c:/AccountBook/AccountWrit.txt");
            String str ="오늘 날씨는 아주 좋습니다.";
            byte[] by=str.getBytes();
            output.write(by);

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}