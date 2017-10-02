/**
 * 
 */
package my.inventory;

import java.util.ArrayList;

/**
 * @author alex.heiskanen
 *	Create Player.java as follows:
 *	- Declare and instantiate a variable inventory to be an empty ArrayList.
 *	- Create the methods needed to interact with the players inventory.
 *	- The ArrayList should not be accessible from other classes. 
 */
public class Player {

	private ArrayList<Item> inventory = new ArrayList<>();
	
	public void addItem(Item item) {
		inventory.add(item);
	}

	public void removeItem(Item item) {
		inventory.remove(item);
	}
}
