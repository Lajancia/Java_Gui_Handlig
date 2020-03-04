import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;

public class Main {
	JFrame jFrame = new JFrame("Layout Pratice");
	  JPanel panel = new JPanel();
	
  public Main() {
	  Container container = jFrame.getContentPane();
	  container.setLayout (new BorderLayout() );
	  
    
	  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     //JTextArea textArea = new JTextArea();
     JLabel label=new JLabel();
   // textArea.setText("I'm JAVA");
    label.setText("I'm java");
    jFrame.add(panel);
    panel.add(label);


    panel.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
        	label.setText("Hi JAVA!");
          
        }
        public void mouseExited(MouseEvent e) {
        	label.setText("I'm JAVA");
         
       }
      });
 
  // container.add(label);
   
   
  
   jFrame.setSize(480,320);
	
	//프레임 보이기 설정
	jFrame.setVisible(true);
  }

  public static void main(String[] args) {
	  new Main();
  }
}
