import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main extends JFrame{

public Main(){
  KeyPanel p = new KeyPanel();
  setContentPane(p); // KeyPanel설정
  setTitle("Left");
  
  setSize(300,300); // size
  setVisible(true); // 표시여부
  p.requestFocus(); // 권한 요청
  
 }
 class KeyPanel extends JPanel {

JLabel la = new JLabel("Left Key"); // 레이블 생성
  public KeyPanel(){ // 패널 생성자
   add(la); // 레이블 추가
   this.addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent e){ 

    	int key = e.getKeyCode();
    
     if(key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT){ 
    	 la.setText("yeK tfeL");
     }
       
    
    }
   });
  }
 }
 public static void main(String args[]){
  new Main();
 }
}
