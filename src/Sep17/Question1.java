package Sep17;

import java.io.File;
import java.rmi.UnexpectedException;
import java.util.Scanner;

 class FileSum {

    public static int read(String filename, int lowerBound) throws Exception {
        Scanner inputFile = new Scanner(new File(filename));

        int acc = 0;
        boolean atLeastOneFound = false;
        while (inputFile.hasNext()) {
            int data = inputFile.nextInt();
            if (data >= lowerBound) {
                acc += data;
                atLeastOneFound = true;
            }
        }

        if (!atLeastOneFound) {
            throw new UnexpectedException("");
        }

        return acc;
    }

}
 //created wrapper class
class FileSumWrapper {
	//create a hanlde method
	// which calles read method in FileSum class
	public static void handle(String filename, int lowerBound){
			try {
				int sum=FileSum.read(filename, lowerBound);
				System.out.println("Sum of all numbers in "+filename+" is "+sum);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
public class Question1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        String filename = keyboard.nextLine();
        System.out.println("Enter a lower bound");
        int lowerBound = keyboard.nextInt();

        FileSumWrapper.handle(filename, lowerBound);
    }

}