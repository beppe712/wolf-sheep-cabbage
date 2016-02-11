
public class Order {
	private Point2D address;
	private int numItems;
	private int[] types;
	
	public Order(Point2D address, int numItems, int[] types){
		this.address = address;
		this.numItems = numItems;
		this.types = types;
	}

	public Point2D getAddress() {
		return address;
	}


	public void setAddress(Point2D address) {
		this.address = address;
	}


	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public int[] getTypes() {
		return types;
	}

	public void setTypes(int[] types) {
		this.types = types;
	}
}
