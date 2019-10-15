package Sep17;

class Engineering{
	private int length;
	private int width;
	//constructor for rectangle
	public Engineering(int aLength, int aWidth) {
		super();
		length = aLength;
		width = aWidth;
	}
	//constructor for circle
	public Engineering(int aLength) {
		super();
		length = aLength;
		width = 0;
	}
	//returns area of circle
	// PI * r^2
	public int circle(){
		return (int)3.14 * length * length;
		
	}
	//returns area of rectangle
	public int rect(){
		if(width==0){
			System.out.println("Invalid method call");
			return -1;
		}
		return length*width;
	}
	//changes the length
	public void chageLength(int l){
		length+=l;
	}
}
public class EngineeringDriver {
public static void main(String[] args) {
	Engineering r = new Engineering(6,7);
	Engineering c = new Engineering(7);
	c.chageLength(4);
	int answer=c.circle();
	System.out.println("Area of circle :"+answer);
	r.chageLength(-5);
	int secondAnswer=r.rect();
	System.out.println("Area of rectangle :"+secondAnswer);
	int thirdAnswer=c.rect();

}
}
