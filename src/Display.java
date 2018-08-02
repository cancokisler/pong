import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JPanel {

	public Display() {		
		
	}
	
	public void paintComponent(Graphics g) {
//		g.fillRect(100,100, 1000, 1000);
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		Ball ball = new Ball(100);
		super.paintComponent(ball.display(g));
	}
		
	
	
	

}
