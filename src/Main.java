import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		Display display = new Display();
		JFrame frame = new JFrame();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		
		frame.add(display);
		frame.setVisible(true);
		
		
		
		
		

	}

	

}
