package Sep16;

class Sandwich {
	private String mainIngredient;
	private String bread;
	private double price;

	// setters and getters for all instance variables
	public String getMainIngredient() {
		return mainIngredient;
	}

	public void setMainIngredient(String aMainIngredient) {
		mainIngredient = aMainIngredient;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String aBread) {
		bread = aBread;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aPrice) {
		price = aPrice;
	}

}

public class TestSandwich {
	public static void main(String[] args) {
		// created sandwich class object
		Sandwich s = new Sandwich();
		// setting the values for object using setters
		s.setBread("Milky");
		s.setMainIngredient("Cashew");
		s.setPrice(10);
		// printing the values using getters
		System.out.println("Bread: " + s.getBread());
		System.out.println("Ingredient: " + s.getMainIngredient());
		System.out.println("Price: " + s.getPrice());

	}
}
