import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.Timer;

public class Ball{
	public int numberOfBalls;
	public int xRange;
	public int yRange;
	public static int x;
	public static int y;
	public int radius;
	public int numberRandX;
	public int numberRandY;
	public int arrayX[];
	public int arrayY[];
	
	public Ball() {
			Random random = new Random();
			
			this.x = random.nextInt(1000);
			this.y = random.nextInt(1000);		
	}
	
	
	
	public void display(Graphics g) {
		
			g.setColor(Color.WHITE);
			
			g.fillOval(x, y, 50, 50);
			
			
	}
	
}
