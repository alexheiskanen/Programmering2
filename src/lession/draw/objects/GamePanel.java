package lession.draw.objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	private int width = 1024;
	private int height = 768;

	private int rectWidth = 32;
	private int rectHeight = 32;
	private int rectX = 750;
	private int rectY = 355;
	private int rectSpeed1 = 1;

	private int rectSpeed2 = -1;
	private int colorV = 255;
	
	private int rectX2 = 100;
	private int rectY2 = 355;
	private int playerX = 200;
	private int playerY = 600;
	
	private int enemyWidth = 70;
	private int enemyHeight = 70;
	
	private int speedX = 0;
	private int speedY = 0;
	
	Rectangle rect1 = new Rectangle(rectX, rectY, enemyWidth, enemyHeight);
	Rectangle rect2 = new Rectangle(rectX2, rectY2, enemyWidth, enemyHeight);
	Rectangle rect3 = new Rectangle(playerX, playerY, rectWidth, rectHeight);

	
	private BufferedImage backgroundImage = null;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private BufferedImage playerImage = null;
	private BufferedImage enemyImage = null;
    
	private Player player1;
	
	public GamePanel(Player player1) {
		
		this.player1 = player1;
		
		backgroundImage = loadImages("src/lession/draw/objects/img/atmosbak.png");
		playerImage = loadImages("src/lession/draw/objects/img/anon.png");
		enemyImage = loadImages("src/lession/draw/objects/img/enemy.png");
		
		Thread thread = new Thread(new Runnable() {

			public void run() {
				while (true) {
					GamePanel.this.repaint();

					try {
						Thread.sleep(1000 / 60);
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
	
	private BufferedImage loadImages(String url) {
		BufferedImage temp = null;
		try {
			temp = ImageIO.read(new File(url));
			return temp;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		g.drawImage(backgroundImage, 0, 0, width, height, 0, 0, backgroundImage.getWidth(),
				backgroundImage.getHeight(), null);
		
		
		g.drawImage(enemyImage, rectX, rectY, 70, 70, null);
		rectX += rectSpeed1;
		
		g.drawImage(playerImage, playerX, playerY, rectWidth, rectHeight, null);
		
		g.drawImage(enemyImage, rectX2, rectY2, 70, 70, null);
		rectX2 += rectSpeed2;

		if (rectX > width - 70 || rectY > height - 70) {
			rectSpeed1 = rectSpeed1 * -1;
		}

		if (rectX == 0) {
			rectSpeed1 = rectSpeed1 * -1;
		}

		if (rectX2 > width - 70 || rectY2 > height - 70) {
			rectSpeed2 = rectSpeed2 * -1;
		}

		if (rectX2 == 0 || rectY == 0) {
			rectSpeed2 = rectSpeed2 * -1;
		}

		
		if (rectX > rectX2 && rectX < rectX2 + 40 || rectX + 40 > rectX2 && rectX + 40 < rectX2 + 40) {
			rectSpeed1 = rectSpeed1 * -1;
			rectSpeed2 = rectSpeed2 * -1;
			
		}
	}
	
	private void colision() {
		if ((playerX > rectX && playerX < rectX + 32 || playerX + 32 > rectX && playerX < rectX + 32) && 
			(playerX > rectX2 && playerX < rectX2 + 32 || playerX + 32 > rectX2 && playerX < rectX2 + 32) && 
			(playerY > rectY && playerX < rectY + 32 || playerX + 32 > rectY && playerX < rectY + 32) && 
			(playerX > rectY2 && playerX < rectY2 + 32 || playerX + 32 > rectY2 && playerX < rectY2 + 32)) {
			
		}
	}
	
	private void movePlayerY(boolean directionY) {
		if (directionY == true)
			playerY += 5;
		else
			playerY -= 5;
	}
	
	private void movePlayerX(boolean directionX) {
		if (directionX == true)
			playerX += 5;
		else 
			playerX -= 5;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.out.println("Exit program!");
			System.exit(0);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			movePlayerX(true);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			movePlayerX(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			movePlayerY(false);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			movePlayerY(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}