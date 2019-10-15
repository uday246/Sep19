package Sep5th;

public class TestMin {
	// function returns the min element from the array
	int a[] = { 95, 25, 65, 75, 45, 85, 5, 35 };
	int nElems = 8;

	public int getMin() {
		// assuming the 0th element as small element
		int min = a[0];
		// comparing with other elements and changing min accordingly
		for (int i = 1; i < nElems; i++)
			if (min > a[i])
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		TestMin m = new TestMin();
		System.out.println("Min Element : " + m.getMin());
	}
}
