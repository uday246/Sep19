package sep20;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

class Cow {
	private int numLegs;

	//constructor
	public Cow(int aNumLegs) {
		super();
		numLegs = aNumLegs;
	}
//getter
	public int getNumLegs() {
		return numLegs;
	}
//tostring
	public String toString() {
		return "Cow [Num of Legs : " + numLegs + "]";
	}

}

public class MinOfSet {
	public static Cow minCow(Collection<Cow> herd) {
		Cow answer = null;
		Iterator<Cow> icow = herd.iterator();
		Cow temp = null;
		answer = icow.next();
		//iterating objects from set
		while (icow.hasNext()) {
			//checking if cow has less legs than other
			// if yes swap
			temp = icow.next();
			if (temp.getNumLegs() < answer.getNumLegs())
				answer = temp;
		}
		return answer;
	}
	public static void main(String[] args) {
		Collection<Cow> herd = new HashSet<>();
		//creating and adding cow object to hasset
		herd.add(new Cow(3));
		herd.add(new Cow(4));
		System.out.println(minCow(herd));
	}
}
