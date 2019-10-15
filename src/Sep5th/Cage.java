package Sep5th;

//implemeting the comparable interface
public class Cage<P extends Pet> implements Comparable{
	private int size;
	private P pet;
	
	
	public Cage(int aSize, P aPet) {
		super();
		size = aSize;
		pet = aPet;
	}
	public boolean checkSize(){
		if(pet.getSize()>size){
			return false;
		}
		return true;
	}

	public int getSize() {
		return size;
	}


	public P getPet() {
		return pet;
	}


	//overriding the compareTo()
	public int compareTo(Object aO) {
		//converting Object to Cage
		Cage c =(Cage)aO;
		// comparing the size of cave with current object size
	    return new Integer(c.getSize()).compareTo(getSize());
	}

}
