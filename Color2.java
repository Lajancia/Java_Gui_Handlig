import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Main
{
	//컴포넌트 생성
	JFrame jFrame = new JFrame("Ten Color Buttons Frame");
//	Frame frame=new Frame();
	
	
	public Main()
	{
		//컴포넌트를 넣을 컨테이너 구하기
		Container container = jFrame.getContentPane();
		container.setLayout (new BorderLayout(5, 7) );

		
		jFrame.setLayout(new GridLayout(0,10));
		//컴포넌트를 컨테이너에 추가
		
		//label1.setBounds(100,100,700,500);
		
		JButton btn1=new JButton("0");
		JButton btn2=new JButton("1");
		JButton btn3=new JButton("2");
		JButton btn4=new JButton("3");
		JButton btn5=new JButton("4");
		JButton btn6=new JButton("5");
		JButton btn7=new JButton("6");
		JButton btn8=new JButton("7");
		JButton btn9=new JButton("8");
		JButton btn10=new JButton("9");
		
		btn1.setBackground (Color.red);
		btn2.setBackground (Color.orange);
		btn3.setBackground (Color.yellow);
		btn4.setBackground (Color.green);
		btn5.setBackground (Color.cyan);
		btn6.setBackground (Color.blue);
		btn7.setBackground (Color.magenta);
		btn8.setBackground (Color.black);
		btn9.setBackground (Color.pink);
		btn10.setBackground (Color.lightGray);
		
		btn1.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"RED");
		    }
		});
		btn2.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"ORANGE");
		    }
		});
		btn3.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"YELLOW");
		    }
		});
		btn4.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"GREEN");
		    }
		});
		btn5.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"CYAN");
		    }
		});
		btn6.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"BLUE");
		    }
		});
		btn7.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"MAGENTA");
		    }
		});
		btn8.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"BLACK");
		    }
		});
		btn9.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"PINK");
		    }
		});
		btn10.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"LIGHT GRAY");
		    }
		});
		jFrame.add(btn1);
		jFrame.add(btn2);
		jFrame.add(btn3);
		jFrame.add(btn4);
		jFrame.add(btn5);
		jFrame.add(btn6);
		jFrame.add(btn7);
		jFrame.add(btn8);
		jFrame.add(btn9);
		jFrame.add(btn10);
	
	

		//프레임 크기 지정
		jFrame.setSize(480,320);
		
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