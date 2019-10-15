package Sep6th;

class Rectangle {
	private int width;
	private int length;

	// constructor to inititalize the vaues
	public Rectangle(int aWidth, int aLength) {
		super();
		width = aWidth;
		length = aLength;
	}

	// setters and getters
	public int getWidth() {
		return width;
	}

	public void setWidth(int aWidth) {
		width = aWidth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int aLength) {
		length = aLength;
	}

	// methods returns the area of rect
	public int area() {
		return length * width;
	}
}
