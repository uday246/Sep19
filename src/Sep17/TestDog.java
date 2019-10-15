package Sep17;

class Dog {
	private String name;
	private String breed;
	private String color;
	private int age;
	private double weight;
	private boolean hasShots;

	/**
	 * 
	 */
	public Dog() {
		name = "n/a";
		breed = "mutt";
		color = "White";
		age = 0;
		weight = 0;
		hasShots = false;
	}

	/**
	 * @param aName
	 * @param aBreed
	 * @param aColor
	 * @param aAge
	 * @param aWeight
	 * @param aHasShots
	 */
	public Dog(String aName, String aBreed, String aColor, int aAge, double aWeight, boolean aHasShots) {
		super();
		name = aName;
		breed = aBreed;
		color = aColor;
		age = aAge;
		weight = aWeight;
		hasShots = aHasShots;
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String aBreed) {
		breed = aBreed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int aAge) {
		age = aAge;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double aWeight) {
		weight = aWeight;
	}

	public boolean isHasShots() {
		return hasShots;
	}

	public void setHasShots(boolean aHasShots) {
		hasShots = aHasShots;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name : " + name + "\nBreed : " + breed + ",\nColor : " + color + "\nAge : " + age + ",\nWeight : "
				+ weight + ",\nHasShots : " + hasShots;
	}

}

public class TestDog {
	public static void main(String[] args) {
		//creating object and initializing values using constructor
		Dog d1 = new Dog("Spot", "Labrador", "golden", 1, 63.5, false);
		//creating object with default constructor
		Dog d2 = new Dog();
		//using setters to set the values
		d2.setName("Max");
		d2.setBreed("blood hound");
		d2.setColor("brown");
		d2.setAge(7);
		d2.setWeight(107.3);
		d2.setHasShots(true);
		System.out.println(d1);
		System.out.println(d2);
	}
}
