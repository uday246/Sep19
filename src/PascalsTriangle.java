

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {

		int num,r,i,j;
		System.out.println("\nEnter the no. of rows : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println("\nEnter the row no to print: ");
		r= sc.nextInt();
		sc.close();
		for(i=1;i<=num;i++)
		{
			// print the only required row, no need to print the all the rows
			if(r==i){
				printRequiredSpace(num-i,3);
				for(j=1;j<=i;j++)
				{
					System.out.printf("%3d",printPascalTriangle(i,j));
					printRequiredSpace(1,3);
				}
				System.out.println("\n");
			}
		}
	}
	// prints the triangle recursively for given row and column
	static int printPascalTriangle(int row,int column)
	{
		if(column==0)
			return 0;
		else if(row==1&&column==1)
			return 1;
		else if(column>row)
			return 0;
		else
			return (printPascalTriangle(row-1,column-1)+printPascalTriangle(row-1,column));
	}
	// print the spaces accordingly between the each char
	static void printRequiredSpace(int num,int mul)
	{
		int i;
		num*=mul;
		for(i=0;i<num;i++)
			System.out.print(" ");
	}
}