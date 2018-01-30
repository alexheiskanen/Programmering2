package lession.draw.objects;

import javax.swing.JFrame;

public class MainGame {

	public static void main(String[] args) {
		
		createAndShowGUI();
		
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Player player1 = new Player();
		GamePanel panel = new GamePanel(player1);
		

		
		frame.add(panel);
		
		frame.addKeyListener(panel);
		frame.addKeyListener(player1);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}
