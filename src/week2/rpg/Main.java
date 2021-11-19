package week2.rpg;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("taksu",15,100);
        GameMap map = new GameMap(5, 5);
        Monster monster = new Monster("요롱롱",2);
        Game game = new Game(monster, player, map);


        game.gameStart();
        //   monster.produce();  // 임이의 위치에 이ㅏ동 몬스터 캐릭터 지뢰생성
        //   player.produce();


    }
}
