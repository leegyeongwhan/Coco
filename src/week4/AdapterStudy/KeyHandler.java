package week4.AdapterStudy;

import java.awt.event.KeyEvent;

public class KeyHandler implements  KeyListener{
    public void keyPressed(KeyEvent e){
        System.out.println(e.getKeyChar());
    }
 //   public void keyReleased(KeyEvent e) {} //불필요
   // public void keyTyped(KeyEvent e) {}




}
