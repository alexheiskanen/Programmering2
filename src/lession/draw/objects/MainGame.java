package lesson.live.graphics;

import javax.swing.JFrame;

public class MainGame {

	public static void main(String[] args) {
		
		createAndShowGUI();
		
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new GamePanel());
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}
