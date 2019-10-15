class Scores {
	private int score1;
	private int score2;
	private int score3;

	Scores(int s) {
		this(s, 0);
	}

	Scores(int s1, int s2) {
		this(s1, s2, 0);
	}

	Scores(int s1, int s2, int s3) {
		if (s1 < 0 || s1 > 300 || s2 < 0 || s2 > 300 || s3 < 0 || s3 > 300)
			throw new IllegalArgumentException("Invalid score");
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}

	public String toString() {
		return "Score 1: " + score1 + "\nScore 2: " + score2 + "\nScore 3: " + score3;
	}

}

class Bowler {
	private String firstName;
	private String lastName;
	private Scores score;

	public Bowler(String aFirstName, String aLastName, Scores aScore) {
		super();
		firstName = aFirstName;
		lastName = aLastName;
		score = aScore;
	}

	public String toString() {
		return firstName + " " + lastName + "\n" + score.toString();
	}
}

public class TestScores {
	public static void main(String[] args) {
		Scores s = new Scores(150, 200, 250);
		Bowler b = new Bowler("Bob", "Smith", s);
		System.out.println(b);
	}
}
