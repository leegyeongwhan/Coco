package week2.rpg;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends Frame {
    public static void main(String[] args) {

        Player player = new Player("taksu", 15, 100);
        GameMap map = new GameMap(5, 5);
        Monster monster = new Monster("요롱롱", 1);
        Game game = new Game(monster, player, map);
        game.gameStart();
    }

        //프레임추가... 핸들러와 액션 어떻게 넣을수잇을까
}

