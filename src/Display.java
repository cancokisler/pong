import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Display extends JPanel {
	public int DirX;
	public int DirY;
	
	Timer refresher = new Timer(16, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			update();
			
			
			
		}});
	public Display() {
		
	}

	public void paintComponent(Graphics g) {
		// g.fillRect(100,100, 1000, 1000);
		this.setBackground(Color.BLACK);
		super.paintComponent(g);

		for (int i = 0; i <= 20; i++) {
			Ball ball = new Ball();
			ball.display(g);
		}
		
		
	}
	
	public void update() {
		Random ballRand = new Random();
		this.DirX = ballRand.nextInt(100);
		this.DirY = ballRand.nextInt(100);
		
		//just random numbers to see if balls are moving or not
		Ball.x += 100;
		Ball.y +=100;
		repaint();
		
		
	}

}
