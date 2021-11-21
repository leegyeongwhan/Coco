package week2.rpg;

import java.util.Random;

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

    public void initGame() {
        //여기서는 플레이어가 몬스터를 잡앗을때 좌표이동
        //초기 플레이어위치 세팅
        //랜덤 몬스터 위치 세팅
        initPlayer();
        initMonster();

    }

    private void initMine() {
        System.out.println("지뢰의숫자:" + monster.minenum);

        //checkMine();
        gameMap.mapPrint();
    }

    private void checkMine() {
        r = new Random();
        int x = r.nextInt(gameMap.x);
        int y = r.nextInt(gameMap.y);

        System.out.println(x);
        System.out.println(y);
        if (gameMap.map[x][y] == gameMap.map[2][2]) {
            checkMine();
        }
        if (gameMap.map[x][y] == "Ｍ") {
            checkMine();
        }
        gameMap.map[x][y] = "✦";
    }

    private void initPlayer() {
        System.out.println("플레이어 이름:" + player.name);
        System.out.println("점수" + player.score);
        System.out.println("레벨" + player.level);
        gameMap.map[2][2] = "⬛";
    }

    private void initMonster() {
        System.out.println("몬스터이름:" + monster.name);
        checkMonster();

    }

    private void checkMonster() {  //가독성이 많이 떨어진다..어떻게 하면 좋을까
        r = new Random();
        int xy[] = new int[2];
        boolean flag = true;
        while (flag) {
            xy[0] = r.nextInt(gameMap.x);
            xy[1] = r.nextInt(gameMap.y);
            System.out.println(xy[0]);
            System.out.println(xy[1]);
            if (xy[0] != 2 || xy[1] != 2) {
                flag = false;
                gameMap.map[xy[0]][xy[1]] = "Ｍ";
            }
        }
        gameMap.mapPrint();
    }

    public void gameStart() {
        initGame();
    }

}

//    play는 움직일수 있다
//    어떻게 아냐
//            키보드를 눌렀을때 플레이어의 위치만 좌표이동
//    좌표이동 시킬때 만약 ㅇ


//    public  int score() {
//        int i = 100;
//        int sumscore = 0;
//        sumscore += i;
//        return sumscore;
//    }


//    private void monsterLocation() {
//        Random r = new Random();
//        int[] monster = new int[2];
//        monster[0] = r.nextInt(5);
//        monster[1] = r.nextInt(5);
//
//        if (monster[0] ==)
//
//
//    }


//
//    private void playerLocation() {
//        int[] xy = new int[2];
//        xy[0] = 2;
//        xy[1] = 2;
//    }
//
//    public int[] movePlayer() {
//        playerLocation();
//        int move[] = new int[2];
//
//
//        return move[];
//    }
//
//
//    public void gameSetting(int[] player, int[][] map) {
//
//
//    }

//    public void gameStart() {
//
//
//        int[] Player = new int[2];
//        Player[0] = 2;
//        Player[1] = 2;
//
//        map[Player[0]][Player[1]] = "P";
//
//        int[] MonsterLocation = monsterLocation();
//        map[MonsterLocation[0]][MonsterLocation[1]] = "M";
//
//        int[] MineLocation = getMineLocation(MonsterLocation);
//



