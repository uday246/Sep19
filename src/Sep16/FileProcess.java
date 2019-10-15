package Sep16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Child extends Thread {
	public void run() {
		PrintWriter pw;
		try {
			//creating file
			pw = new PrintWriter(new FileWriter("data.txt"));
			Random r = new Random();
			//generating 10 random  numbes
			for (int i = 0; i < 10; i++) {
				//adding to file
				pw.println(r.nextInt(100));
			}
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class FileProcess {
	public static void main(String[] args) throws Exception {
		//creating object for child class
		Child c = new Child();
		//starting child thread
		c.start();
		//calling join so that parent will wait untill child completed it execution
		c.join();
		//opening the file created by child
		Scanner sc = new Scanner(new File("data.txt"));
		int sum = 0, num;
		//retriving elements from file
		while (sc.hasNext()) {
			num = sc.nextInt();
			//printing and adding to sum
			System.out.println(num);
			sum += num;
		}
		//printing sum of numbers
		System.out.println("Sum of Numbers: "+sum);
		sc.close();
	}
}
