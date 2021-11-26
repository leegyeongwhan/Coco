package Struybook.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId" ,"1234");
        map.put("asId" ,"1111");
        map.put("asId" ,"1234");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("id와password");
            System.out.println("id");
            String  id=  scanner.nextLine().trim();
            System.out.println("passowrd");
            String  password=  scanner.nextLine().trim();

            if(!map.containsKey(id)){
                System.out.println("존재하지않습니다");
                continue;
            }
            if(!(map.get(id)).equals(password)){
                System.out.println("비밀번호가 일치하지않습니다");
            }else {
                System.out.println("로그인완료");
                break;
            }
        }

    }
}
