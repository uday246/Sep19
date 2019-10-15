package Sep16;

import java.util.Scanner;

public class MoveEstimator {
public static void main(String[] args) {
	int total=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of hours for movie: ");
	int hours=sc.nextInt();
	System.out.println("Enter number of mile involed in Movie");
	int miles=sc.nextInt();
	total=200; // adding base price;
	total=total+hours*150; //adding the price hours. where each hour takes 150$
	total=total+miles*2;  //adding the price miles. where each mile takes 2$
	System.out.println("Total: $"+total);
}
}
