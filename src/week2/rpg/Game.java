package week2.rpg;

public class Game {
    String[][] scoreboard = new String[5][5];

    public void init() {
        for (int i = 0; i < scoreboard.length; i++) {
            for (int j = 0; j < scoreboard.length; j++) {
                scoreboard[i][j] = "ㅁ ";
            }
            scoreboard[2][2] = " P ";
        }

        mapeeting();

    }

    public void mapeeting() {
        for (int i = 0; i < scoreboard.length; i++) {
            for (int j = 0; j < scoreboard.length; j++) {
                System.out.printf(scoreboard[i][j]);
            }
            System.out.println();
        }
    }


    public void start() {
        System.out.println("game start w a s d키를 입력하세요");
    }

    public void result() {

    }
}
