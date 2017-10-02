/**
 *
 */
package my.inventory;



/**
 * @author alex.heiskanen
 * 	An item has a 
 *	name, 
 *	value,
 *	weight,
 *	type, 
 *	and the quantity in the inventory. 
 */
public class Item {
	private String name;
	private int value;
	private int weight;
	private int type;
	private int quantity;
	
	public Item(String name, int value, int weight, int type, int quantity) {
		this.name = name;
		this.value = value;
		this.weight = weight;
		this.type = type;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getType() {
		return type;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
