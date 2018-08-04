import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball{
	
	private int x;
	private int y;
	private int dirX = 1;
	private int dirY = 1;
	private int r, g, b;
	Color colorVariable = new Color(r, g, b);
	
	public Ball() {
		Random random = new Random();

		this.x = random.nextInt(1000);
		this.y = random.nextInt(800);	

		this.r = random.nextInt(255);
		this.g = random.nextInt(255);
		this.b = random.nextInt(255);

		this.colorVariable = new Color(r, g, b);
	}
	
	
	
	public void display(Graphics g) {

		g.setColor(this.colorVariable);

		g.fillOval(x, y, 50, 50);
			
			
	}
	
	public void update() {
		
		Random ballRand = new Random();
		//this.DirX = ballRand.nextInt(100);
		//this.DirY = ballRand.nextInt(100);
		
		//just random numbers to see if balls are moving or not
		x += dirX;
		y += dirY;
		
		
		if(this.x >= 1000 || this.x <= 0) {
			this.dirX *= -1;					
		}
		if(this.y >= 800 || this.y <= 0) {
			this.dirY *= -1;
		}		
		
	}



	
	
}
