package PredicateInterfaceAPredefinedFunctionalInterface;

public class Apple {
	String color;
	int price;
	Apple(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		Apple apple = (Apple) obj;
		if (this.getColor().equals(apple.getColor())
				&& this.getPrice() == apple.getPrice()) {
			return true;
		}
		return false;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
