package multitasking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList players = new ArrayList();
	
	public static void main(String[] args) {

		Scanner nameScanner = new Scanner(System.in);
		System.out.println("Choose your name: ");
		Player realPlayer = new Player(nameScanner.nextLine());
		
		players.add(realPlayer);

		Player player1 = new Player("Lukas");
		Player player2 = new Player("Lucas");
		Player player3 = new Player("Mathias");
		Player player4 = new Player("Mattias");
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		System.out.println(players.size());
		
		System.out.println(realPlayer.getName());
		
		System.out.println(player1.getFistDamage());
		player2.setFistDamage(100);
		System.out.println(player4.getFistDamage());
		
		System.out.println();
		
	}

}
