import java.awt.Color;
//import java.io.IOException;

import javax.swing.JFrame;
import java.util.Timer;
//import java.util.TimerTask;
import javax.swing.JLabel;


public class Main {
	static JLabel lblTime;
	
	public static Timer timer;
	public static TimerCounter tasknew;
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Minesweeper");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 150);
		myFrame.setSize(340, 400);
		
		MyPanel myPanel = new MyPanel();
		myPanel.genMines();
		myFrame.add(myPanel);
		
		MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
		myFrame.addMouseListener(myMouseAdapter);
		
		
		//Timer
				tasknew = new TimerCounter();
				timer = new Timer();		
				lblTime = new JLabel();
				lblTime.setForeground(Color.BLUE);
				
				

		
		
		
		myFrame.setVisible(true);
	}
//	public static JFrame reinitialize() throws IOException{
//		
//		
//		return 0;
//	}
}