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
	public Ball() {
			Random random = new Random();
			
			this.x = random.nextInt(1000);
			this.y = random.nextInt(1000);		
	}
	
	public Graphics display(Graphics g) {
		
		
			g.drawOval(x, y, radius, radius);
			g.setColor(Color.WHITE);
			return g;
	}
}
