import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main
{
	//컴포넌트 생성
	JFrame jFrame = new JFrame("Let's practice clicking");
	
	JLabel label=new JLabel("J");

	
	
	public Main()
	{
		//컴포넌트를 넣을 컨테이너 구하기
		Container container = jFrame.getContentPane();
		container.setLayout (new BorderLayout(5, 7) );


		container.add(label);
	

		
		label.setBounds(100,100,500,400);
		
		container.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	Random r=new Random();
	    		
	    		label.setBounds(r.nextInt(285)+75,r.nextInt(240)-120,500,400);
	    		
	          
	        }
	      
	      });
	

		//프레임 크기 지정
		jFrame.setSize(500,400);
		
		//프레임 보이기 설정
		jFrame.setVisible(true);
		
		//종료 버튼 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//실행
		new Main();
		
	}

}