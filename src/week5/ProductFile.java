package week5;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    static File file;

//    public static List<ProductInfo> readProductFile(File file) throws IOException {
//        file =
//        List<ProductInfo> filelist = new ArrayList<ProductInfo>();
//        return;
//    }

    public  void writeProductFile(List<ProductInfo> productInfoList)  {
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
                        + productInfoList.get(i).getPrice() + "," + productInfoList.get(i).getCount();
                byte[] b = str.getBytes();
                outFile.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outFile != null) outFile.close();
            }catch (Exception e){
            }
        }
    }

    public void  readerProductFile(){
        file = new File("C:\\Users\\leekh\\OneDrive\\바탕 화면\\Test.txt");
        FileReader fileReader = null;
    }


}
