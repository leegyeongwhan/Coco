package week1.Mission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Member {
    public static List<String> checkMember(int input) {

        List<String> member = member();
        memberSuffle(member);

        return sublistMember(member, input);
    }

    private static List<String> sublistMember(List<String> member, int input) {
        return member.subList(0, input);
    }


    private static List<String> member() {
        List<String> member = new ArrayList<String>();
        member.add("탁수");
        member.add("제리");
        member.add("만두");
        member.add("mk");
        member.add("타니");
        member.add("노리");
        member.add("땃쥐");
        member.add("k");
        member.add("피오");
        member.add("동기");
        member.add("단");
        return member;
    }

    public static void memberSuffle(List<String> member) {

        Collections.shuffle(member);

    }


}
