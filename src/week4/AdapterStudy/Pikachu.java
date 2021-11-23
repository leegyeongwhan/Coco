package week4.AdapterStudy;

public class Pikachu extends MosterAdapter{
    public void eat(Monster m){
        System.out.println("맛있다"+m);
    }  //불필요한 메서드들까지 오버라이딩 안해도된다
}
