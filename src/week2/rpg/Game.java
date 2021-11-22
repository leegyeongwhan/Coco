package week2.rpg;

import java.util.Random;
import java.util.Scanner;

public class Game {
    //    GameMap gm = new GameMap();
    Random r;
    private Monster monster;
    private Player player;
    private GameMap gameMap;
    //String[][] map = gameMap.map;

    Game(Monster monster, Player player, GameMap gameMap) {
        this.monster = monster;
        this.player = player;
        this.gameMap = gameMap;
    }


    public void gameStart() {
        initGame();
    }

    public void initGame() {
        //여기서는 플레이어가 몬스터를 잡앗을때 좌표이동
        //초기 플레이어위치 세팅
        //랜덤 몬스터 위치 세팅
        initPlayer();
        initMonster();
        initMine();
        //게임에 필요한 캐릭터들 위치조정
        gamePlayLocation(locationMine(), locationMonster(), locationPlayer());  //난수들만듬

    }

    private void gamePlayLocation(int[] locationMine, int[] locationMonster, int[] locationPlayer) {
        int[] locationPlayerXy;
        locationPlayerXy = locationPlayer;
        gameMap.map[locationPlayerXy[0]][locationPlayerXy[1]] = "⬛";
        int[] locationMineXy;
        locationMineXy = locationMine;
        gameMap.map[locationMineXy[0]][locationMineXy[1]] = "✦";
        int[] locationMosterXy;
        locationMosterXy = locationMonster;
        gameMap.map[locationMosterXy[0]][locationMosterXy[1]] = "Ｍ";
        gamePlay(locationMineXy, locationMosterXy, locationPlayerXy);
    }


    private boolean gamePlay(int[] locationMine, int[] locationMonster, int[] locationPlayer) {

        while (true) {
            gameMap.mapPrint();
            locationPlayer = movePlayer(locationPlayer);
            if (locationPlayer[0] == locationMonster[0] && locationPlayer[1] == locationMonster[1]) {
                System.out.println("몬스터를 잡았습니다");
                return true;
            } else if (locationPlayer[0] == locationMine[0] && locationPlayer[1] == locationMine[1]) {
                System.out.println("마인을 밟았습니다");
                return false;
            }
        }
    }


    private int[] movePlayer(int[] locationPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("w a s d 중 하나를 입력하세요  ");
        String move = scanner.nextLine();
        int[] xy = new int[2];
        xy = locationPlayer;
        switch (move) {
            case "w":
                if (xy[0] - 1 < 0) {
                    System.out.println("잘못된 값을 입력했습니다.");
                    xy[0] = locationPlayer[0];
                    xy[1] = locationPlayer[1];
                    return xy;
                }
                gameMap.map[xy[0] - 1][xy[1]] = gameMap.map[xy[0]][xy[1]];
                gameMap.map[xy[0]][xy[1]] = "ㅁ";   //player 의 위치를.. 어떻게하면 더 잘 옮길수있을까
                xy[0] = xy[0] - 1;
                xy[1] = xy[1];
                return xy;
            case "s":
                gameMap.map[xy[0] + 1][xy[1]] = gameMap.map[xy[0]][xy[1]];
                gameMap.map[xy[0]][xy[1]] = "ㅁ";
                xy[0] = xy[0] + 1;
                xy[1] = xy[1];
                return xy;

            case "a":
                gameMap.map[xy[0]][xy[1] - 1] = gameMap.map[xy[0]][xy[1]];
                gameMap.map[xy[0]][xy[1]] = "ㅁ";
                xy[0] = xy[0];
                xy[1] = xy[1] - 1;
                return xy;

            case "d":
                gameMap.map[xy[0]][xy[1] + 1] = gameMap.map[xy[0]][xy[1]];
                gameMap.map[xy[0]][xy[1]] = "ㅁ";
                xy[0] = xy[0];
                xy[1] = xy[1] + 1;
                return xy;
        }
        return xy;
    }


    private void initMine() {
        System.out.println("지뢰의숫자:" + monster.minenum);
        //    locationMine();
        //   gameMap.mapPrint();
    }

    private int[] locationMine() {
        int[] xy = new int[2];
        r = new Random();
        xy[0] = r.nextInt(gameMap.x);
        xy[1] = r.nextInt(gameMap.y);
        if (gameMap.map[xy[0]][xy[1]] == gameMap.map[2][2]) {
            xy[0] = r.nextInt(gameMap.x);
            xy[1] = r.nextInt(gameMap.y);
        } else if (gameMap.map[xy[0]][xy[1]] == "Ｍ") {
            xy[0] = r.nextInt(gameMap.x);
            xy[1] = r.nextInt(gameMap.y);
        }

        // gameMap.map[x][y] = "✦";
        return xy;
    }

    private void initPlayer() {
        System.out.println("플레이어 이름:" + player.name);
        System.out.println("점수" + player.score);
        System.out.println("레벨" + player.level);
        //  gameMap.map[xy[0]][xy[1]] = "⬛";
    }

    private int[] locationPlayer() {
        int[] xy = new int[2];
        xy[0] = 2;
        xy[1] = 2;
        return xy;
    }


    private void initMonster() {
        System.out.println("몬스터이름:" + monster.name);
        //  locationMonster();

    }

    private int[] locationMonster() {  //가독성이 많이 떨어진다..어떻게 하면 좋을까
        r = new Random();
        int xy[] = new int[2];

        boolean flag = true;
        while (flag) {
            xy[0] = r.nextInt(gameMap.x);
            xy[1] = r.nextInt(gameMap.y);
            if (xy[0] != 2 || xy[1] != 2) {
                flag = false;
                // gameMap.map[xy[0]][xy[1]] = "Ｍ";
            }
        }
        return xy;
    }

}


