import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Display extends JPanel implements ActionListener {
	
	public int DirX;
	public int DirY;
	Ball ball[] = new Ball[20];
	
	Timer refresher = new Timer(10, this);
	
	
	public Display() {
		refresher.start();
		for(int i = 0; i < this.ball.length; i++) {
			ball[i] = new Ball();
		}
	}

	public void paintComponent(Graphics g) {
		// g.fillRect(100,100, 1000, 1000);
		this.setBackground(Color.WHITE);
		super.paintComponent(g);
		for (int i = 0; i < this.ball.length; i++) {
			ball[i].display(g);
		}
			
	}
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < this.ball.length; i++) {
			ball[i].update();
		}
		repaint();
	}
	
}
	

