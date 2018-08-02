import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Ball{
	public int numberOfBalls;
	public int xRange;
	public int yRange;
	public int x;
	public int y;
	public int radius;
	public int numberRandX;
	public int numberRandY;
	public int arrayX[];
	public int arrayY[];
	public Ball(int numberOfBalls) {
		this.numberOfBalls = numberOfBalls;
		
		for(int i = 0; i <= numberOfBalls; i++) {
			
			Random random = new Random();
			
			int numberRandX = random.nextInt(1000);
			int numberRandY = random.nextInt(1000);
			
			arrayX[i] = numberRandX;
			arrayY[i] = numberRandY;
			
			
			
			
			
			
			
			
		}
		
		
		
	}
	
	public void display(Graphics g) {
		for(int i = 0; i <= numberOfBalls; i++) {
			g.drawOval(arrayX[i], arrayY[i], radius, radius);
			g.setColor(Color.WHITE);
		}
		
		
	}
}
