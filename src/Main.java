import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		Display display = new Display();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		Ball ball = new Ball(100);
		panel.display(ball);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		
		frame.add(display);
		frame.setVisible(true);
		
		
		frame.paintComponents(g);
		
		
		

	}

	

}
