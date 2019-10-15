package Sep5th;

import java.io.File;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.AbstractMap;
import java.util.LinkedList;

public class WordCountLinkedList254{

    public static Entry count_ARRAY(String[] tokens) {

        int CAPACITY = 10000;
        // here declaring array to store the 10000 words
        String[] words = new String[CAPACITY];
        //another integer array to maintain the count of words
        int[] counts = new int[CAPACITY];

        // iterating the words in the array
        // by taking each word
        for (int j = 0; j < tokens.length; j++) {
        	// pulling out word into token
            String token = tokens[j];
            // starting from the 0 so compare the selected word with every word in the words list
            // so that we will get the count
            for (int i = 0; i < CAPACITY; i++) {
            	// if words[i] is null than it is first time
            	//adding count as 1
                if (words[i] == null) {
                    words[i] = token;
                    counts[i] = 1;
                    break;
                    
                }// if already exist same token increase count at i +1 
                else if (words[i].equals(token))
                    counts[i] = counts[i] + 1;
            }
        }
        int maxCount = 0;
        String maxWord = "";
        // iterating the counts array to find the word which occurs more number of times
        for (int i = 0; i < CAPACITY & words[i] != null; i++) {
            if (counts[i] > maxCount) {
                maxWord = words[i];
                maxCount = counts[i];
            }
        }
        // returning the word and its count
        return new AbstractMap.SimpleEntry < String, Integer > (maxWord, maxCount);
    }
  

    // this part the program is not correct. it is wrong
   public static Entry count_LINKED_LIST(String[] tokens) {
       //created linked list to stored the value 
	   LinkedList list = new LinkedList ();
        
        for (int j = 0; j < tokens.length; j++) {
        	// pulling the each token
            String word = tokens[j];
            boolean found = false;

            /* for (int i = 0; i < list.size(); i++) {
            Entry e = list.get(i);
            if (word.equals(e.getKey())) {
            e.setValue(e.getValue() + 1);
            list.set(i, e);
            found = true;
            break;
               }
            }*/

            int i = 0;
            //iterating the list
            // check if value already exist
            for (Entry e: list) {
                if (word.equals(e.getKey())) {
                    e.setValue(e.getValue() + 1);
                    list.set(i, e);
                    i++;
                    found = true;
                    break;
                }
            }

            if (!found)
                list.add(new AbstractMap.SimpleEntry (word, 1));
        }
        int maxCount = 0;
        String maxWord = "";
        for (int i = 0; i < list.size(); i++) {
            int count = list.get(i).getValue();
            if (count > maxCount) {
                maxWord = list.get(i).getKey();
                maxCount = count;
            }
        }
        return new AbstractMap.SimpleEntry < String, Integer > (maxWord, maxCount);
    }
  
   // this method reads the words from the file and returns array of words
    static String[] readText(String PATH) throws Exception {
        Scanner doc = new Scanner(new File(PATH)).useDelimiter("[^a-zA-Z]+");
        int length = 0;
        //finding the number of words in the file
        while (doc.hasNext()) {
            doc.next();
            length++;
        }
      
        //creating the array with size number of words
        String[] tokens = new String[length];
        Scanner s = new Scanner(new File(PATH)).useDelimiter("[^a-zA-Z]+");
        length = 0;
        // splitting each word
        while (s.hasNext()) {
        	//putting into the array
            tokens[length] = s.next().toLowerCase();
            length++;
        }
        doc.close();
      
        //returning array
        return tokens;
    }
  
    public static void main(String[] args) throws Exception {
      
    	// path where file exist
        String PATH = "/Users/jianguolu/Dropbox/254/code/dblp1k.txt ";
        //calling method to get the array of words
        String[] tokens = readText(PATH);
        // noted starting the timer
        long startTime = System.currentTimeMillis();
        //calling linked list method
        Entry entry = count_LINKED_LIST(tokens);
        //noting end  time
        long endTime = System.currentTimeMillis();
        //finding total time it took to compute
        String time = String.format("%12d", endTime - startTime);
        System.out.println("time\t" + time + "\t" + entry.getKey() + ":" + entry.getValue());
      
        //reading tokens into another array
        tokens = readText(PATH);
        //noting starting time
        startTime = System.currentTimeMillis();
        ///caling array functionality
        entry = count_ARRAY(tokens);
        //noted end time
        endTime = System.currentTimeMillis();
        //finding time took to complete functionality
        time = String.format("%12d", endTime - startTime);
        System.out.println("time\t" + time + "\t" + entry.getKey() + ":" + entry.getValue());
    }
}