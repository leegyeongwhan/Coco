package week2.rpg;

public class GameMap {
    int x;
    int y;

    String[][] map;

    GameMap(int x, int y) {
        this.x = x;
        this.y = y;
        this.map = new String[x][y];
        mapsetting();
    }

    public GameMap() {

    }

    public String[][] mapsetting() {
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                this.map[i][j] = "ㅁ";
            }
        }
        return map;

    }

    public void mapPrint(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.printf(map[i][j]);
            }
            System.out.println();
        }

    }

}
