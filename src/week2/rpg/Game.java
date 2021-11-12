package week2.rpg;

import java.util.Random;

public class Game {
    String[][] scoreboard = new String[5][5];

    private void init() {
        for (int i = 0; i < scoreboard.length; i++) {
            for (int j = 0; j < scoreboard.length; j++) {
                scoreboard[i][j] = "ㅁ";
            }
        }

        mapseting();

    }

    private void mapseting() {
        for (int i = 0; i < scoreboard.length; i++) {
            for (int j = 0; j < scoreboard.length; j++) {
                System.out.printf(scoreboard[i][j]);
            }
            System.out.println();
        }
    }


    public void start(int player, int[][] map, int[] monster, int[] mine) {
        init();
    }

    public void result() {

    }

//    public  int score() {
//        int i = 100;
//        int sumscore = 0;
//        sumscore += i;
//        return sumscore;
//    }

    private void monster(){
        Random r  = new Random();
        int[]monster= new int[2];
        monster[0] = r.nextInt(5);
        monster[1] = r.nextInt(5);
    }
    private void monsterLocation(int[] monter){

    }

    private void player(){

    }

    private void playerLocation(){

    }


}
