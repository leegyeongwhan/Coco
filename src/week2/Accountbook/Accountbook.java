package week2.Accountbook;

import java.util.*;

public class Accountbook {

    private static Scanner scanner = new Scanner(System.in);
    // private static HashSet<BookData> accountbook = new LinkedHashSet<BookData>();
    private  List<BookData> accountbook = new ArrayList<BookData>();
    static int count = 0;

    public void mainmenu() {
        System.out.println("-------------");
        System.out.println("입력Insert=1");
        System.out.println("출력Select=2");
        System.out.println("수정Update=3");
        System.out.println("삭제delete=4");
        System.out.println("종료=5");
        System.out.println("-------------");


    }

    private void insert() {
        BookData bookData = new BookData();
        System.out.println("날짜를 입력하세요");
        bookData.setdate(scanner.nextInt());
        System.out.println("품복을 입력하세요");
        bookData.setsummary(scanner.next());
        System.out.println("수입을 입력하세요");
        bookData.setincom(scanner.nextInt());
        System.out.println("지출을 입력하세요");
        bookData.setoutlay(scanner.nextInt());
        bookData.setNumber(++count);
        accountbook.add(bookData);

//        for(int i= 0; i<accountbook.size(); i++) {
//            System.out.println(accountbook.get(i).toString());
//        }
    }

    private void delete() {
        System.out.println("번호를 입력");
        int inputNumber = scanner.nextInt();
        accountbook.remove(inputNumber);
    }

    private void update() {
        System.out.println("번호를 입력");
        int inputNumber = scanner.nextInt();

        BookData bookData = new BookData();
        System.out.println("날짜를 입력하세요");
        bookData.setdate(scanner.nextInt());
        System.out.println("품복을 입력하세요");
        bookData.setsummary(scanner.next());
        System.out.println("수입을 입력하세요");
        bookData.setincom(scanner.nextInt());
        System.out.println("지출을 입력하세요");
        bookData.setoutlay(scanner.nextInt());
        bookData.setNumber(++count);


        // accountbook.set(inputNumber, bookData);


    }

    private void readData() {
        System.out.println("번호를 입력");
        int inputnumber = scanner.nextInt();
        BookData bookItem = accountbook.get(inputnumber);
        System.out.println("순번" + bookItem.getNumber());
        System.out.println("적요" + bookItem.getSummary());
        System.out.println("수입" + bookItem.getIncom());
        System.out.println("지출" + bookItem.getOutlay());
        System.out.println("잔액");

    }

    private void readAllData() {
        for (int i = 0; i < accountbook.size(); i++) {
            System.out.println("번호 " + accountbook.get(i).getNumber());
            System.out.println("날짜 " + accountbook.get(i).getDate());
            System.out.println("품목 " + accountbook.get(i).getSummary());
            System.out.println("수입 " + accountbook.get(i).getIncom());
            System.out.println("지출 " + accountbook.get(i).getOutlay());
            System.out.println();
        }
        System.out.println("-----------------------------");

    }

//    public static void userView() {
//        login = new login();
//        System.out.println("id입력");
//        login.setId(scanner.next());
//
//        login.setPassword(scanner.next());
//        userlogin.add(login);
//
//        // updateUser(id,password);
//    }

    public  void accountRunning() {
        while (true) {
            menu();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    insert();
                    break;
                case 2:
                    readData();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    readAllData();
                    break;
                default:
                    break;
            }
        }
    }

    public static void menu() {

        System.out.println("-------------");
        System.out.println("입력Insert=1");
        System.out.println("출력Select=2");
        System.out.println("수정Update=3");
        System.out.println("삭제delete=4");
        System.out.println("모두출력=5");
        System.out.println("-------------");


    }
}