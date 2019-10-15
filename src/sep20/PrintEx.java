package sep20;

import java.util.Scanner;

public class PrintEx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=112;
	System.out.println((char)i);
	double d;
	String s;
	System.out.println("Enter String : ");
	s=sc.next();
	s.substring(1).length();
	System.out.println("Enter integer : ");
	i=sc.nextInt();
	System.out.println("Enter double: ");
	d=sc.nextDouble();
	//printing the 4 spaces before int
	System.out.printf("%4d\n",i);
	//printing only 2 fraction values
	System.out.printf("%.2f\n",d);
	System.out.printf("%s",s);
	
	
}
}
