package week1.Mission;

import java.util.List;

public class Main {
    public  static void main(String[] arg){
        final int input = Prompt.takeMemberCount();  //몇명입력한건지

        Prompt.memberSuffle(input);
    }
}
