
public class Warehouse {
	private Point2D address;
	private int[] inventory;
	
	public Warehouse(Point2D address, int[] inventory){
		this.address = address;
		this.inventory = inventory;
	}

	public Point2D getAddress() {
		return address;
	}

	public void setAddress(Point2D address) {
		this.address = address;
	}

	public int[] getInventory() {
		return inventory;
	}

	public void setInventory(int[] inventory) {
		this.inventory = inventory;
	}
}
