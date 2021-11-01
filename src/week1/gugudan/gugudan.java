package week1.gugudan;

public class gugudan {
    public static void main (String[] args){
        for(int i=2; i<=9; i++){
            System.out.print(+i+"단");
            for(int j=1; j<=9; j++){
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
