import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadNames {
	public static void main(String[] args) throws Exception {
		// create file with name names.txt at class path
		BufferedReader br = new BufferedReader(new FileReader(new File("names.txt")));
		List<String> list = new ArrayList<String>();
		String line = br.readLine();
		// reading names from file
		while (line != null) {
			list.add(line);
			line = br.readLine();
		}
		br.close();
		
		System.out.println("Number of names read is " + list.size());
		String[] arr = new String[list.size()];
		int index = 0;
		// copying names into array and printing
		for (String str : list) {
			System.out.println(str);
			arr[index++] = str;
		}
		// sorting array
		Arrays.sort(arr);
		
		System.out.println("\nAscending order\n");
		displayNames(arr, arr.length);
		System.out.println("\nDescending order\n");
		reverseNames(arr, arr.length);

	}
	public static void displayNames(final String names[],int size){
		for (String str : names) {
			System.out.println(str);
		}
	}
	public static void reverseNames(final String names[],int size){
		for(int i=size-1;i>=0;i--)
			System.out.println(names[i]);
	}
}
