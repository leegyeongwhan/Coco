package week5;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    static File file;

    public void writeProductFile(List<ProductInfo> productInfoList) {
        file = new File("C:\\Users\\leekh\\OneDrive\\바탕 화면\\Test.txt");
        OutputStream outFile = null;
        try {
            if (file.exists()) {
                Desktop.getDesktop().edit(file);
            } else {
                file.createNewFile();
                Desktop.getDesktop().edit(file);
            }
            outFile = new BufferedOutputStream(new FileOutputStream(file));
            for (int i = 0; i < productInfoList.size(); i++) {
                String str = productInfoList.get(i).getNumber() + "," + productInfoList.get(i).getName() + ","
                        + productInfoList.get(i).getPrice() + "," + productInfoList.get(i).getCount() + "\n";
                byte[] b = str.getBytes();
                outFile.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outFile != null) outFile.close();
            } catch (Exception e) {
            }
        }
    }


    public List<ProductInfo> readProductFile() {
        file = new File("C:\\Users\\leekh\\OneDrive\\바탕 화면\\Test.txt");
        FileReader fileReader = null;
        List<ProductInfo> list = new ArrayList<ProductInfo>();

        try {
            fileReader = new FileReader(file);  //파일에서 읽어온값을 list 에 저장
            list = readList(fileReader);
        } catch (Exception e) {
            System.out.println("파일 읽기 오류");
        }
        return list;
    }

    public List<ProductInfo> readList(FileReader fileReader) {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<ProductInfo> list = new ArrayList<ProductInfo>();
        String str;
        try {
            while ((str = bufferedReader.readLine()) != null) {  //한줄씩 읽기
                String[] strarr = str.split(",");  // 1 콜라 1000 10
                if (strarr.length != 4) {
                    continue;               //품목의 컬럼 번호,이름,가격,갯수
                }
                ProductInfo info = new ProductInfo();
                info.setNumber(Integer.parseInt(strarr[0]));
                info.setName(strarr[1]);
                info.setPrice(Integer.parseInt(strarr[2]));
                info.setCount(Integer.parseInt(strarr[3]));
                list.add(info);
            }
        } catch (Exception e) {
            System.out.println("파일 읽기 오류");
        }
        return list;
    }

}
