class BoggleBoard {
	private char arr[][] = new char[4][4];

	public BoggleBoard() {
		mix();
	}

	//creates the borad with given string of chars
	public BoggleBoard(String str) {
		int index = 0;
		if(str.length()<16){
			System.out.println("Not sufficient chars. Using random chars");
			mix();
		}
		else{
			
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				arr[i][j] = str.charAt(index++);
			}
		}
	}

	// returning the char at given point
	public char getCell(int row, int col) {
		if (row >= 4 || row < 0 || col >= 4 || col < 0)
			return (char) 0;
		return arr[row][col];
	}

	// filling the board with random chars
	public void mix() {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				int index = (int) (System.nanoTime() % str.length());
				arr[i][j] = str.charAt(index);
			}
	}

	// returning board in table format
	public String toString() {
		String str = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				str = str + " " + arr[i][j];
			}
			str = str + "\n";
		}
		return str;
	}
}

public class TestBoggleBoard {
	public static void main(String[] args) {
		//creating board with set of chars
		BoggleBoard b = new BoggleBoard("12345678ABCDEFGH");
		//printing board
		System.out.println(b);
		System.out.println(b.getCell(2, 2));

	}
}
