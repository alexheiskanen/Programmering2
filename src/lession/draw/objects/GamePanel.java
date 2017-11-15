package lesson.live.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.sun.javafx.geom.Rectangle;

public class GamePanel extends JPanel{
	
	private int width = 1000;
	private int height = 600;
	
	private int rectX = 250;
	private int rectY = 300;
	private int rectX2 = 750;
	private int rectY2 = 300;
	
	private int rectW = 32;
	private int rectH = 32;
	
	Rectangle rect1 = new Rectangle(rectX, rectY, rectW, rectH);
	Rectangle rect2 = new Rectangle(rectX2, rectY2, rectW, rectH);

	
	
	public GamePanel() {
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				while(true){
					//System.out.println("Thread running");
					
					GamePanel.this.repaint();
					
					try {
						Thread.sleep(1000/60);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		thread.start();
	}
	
	
	
	
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.fillRect(rect1.x--, rect2.y, rect2.width, rect2.height);
		g.fillRect(rect2.x++, rect2.y, rect2.width, rect2.height);
		
		if(rect1.contains(rect2)) {

		}
		
		System.out.println(rectX);
		
	}
	
	
}
