package sep20;

public class DemoHorses {
	public static void main(String args[]) {
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		horse1.setName("Old Paint");
		horse1.setColor("brown");
		horse1.setBirthYear(2009);
		horse2.setName("Champion");
		horse2.setColor("black");
		horse2.setBirthYear(2011);
		horse2.setRaces(4);
		System.out.println(
				horse1.getName() + " is " + horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
		System.out.println(
				horse2.getName() + " is " + horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
		System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
	}
}

class Horse {
	private String name;
	private String color;
	private int birthYear;
	// add private variables here

	public String getName() {
		return name;
		// write method code here
	}

	public String getColor() {
		return color;
		// write method code here
	}

	public int getBirthYear() {
		return birthYear;

		// write method code here
	}

	public void setName(String n) {
		name = n;
		// write method code here
	}

	public void setColor(String c) {
		color = c;
		// write method code here
	}

	public void setBirthYear(int y) {
		birthYear = y;
		// write method code here
	}
}

class RaceHorse extends Horse
// Extend the Horse class as RaceHorse here
{
	// add private variables here
	int races;

	public int getRaces() {
		return races;
		// write method code here
	}

	public void setRaces(int r) {
		// write method code here
		races = r;
	}
}