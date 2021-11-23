package Struybook.ch11;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("stop");
    }
}

interface Fightable extends Moveable,Attackable {
    void move(int x, int y);
}
interface Moveable {
    void move(int x, int y);
}
interface Attackable {
    void attack(Unit2 u);
}
class  Fighter extends Unit2 implements Fightable{
    public void move(int x, int y) {
        System.out.println(x+"간다"+y);
    }
    public void attack(Unit2 u) {
        System.out.println(u+"공격");
    }
}
public class InterfaceStudy {
    public static void main(String[] args){
//        Unit2 f = new Fighter();
//        f.move(1,2);
        Fighter f = new Fighter();

        if(f instanceof Unit2){
            System.out.println("자손관꼐입니다");
        }
        if(f instanceof Fightable){
            System.out.println("인터페이스를 구현했습니다");
        }
        if(f instanceof Moveable){
            System.out.println("인터페이스구현했습니다");
        }
        if(f instanceof Attackable){
            System.out.println("인터페이스를 구현했습니다");
        }
        if(f instanceof Object){
            System.out.println("자손관계입니다");
        }
    }
}
