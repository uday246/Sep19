package Sep17;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
   private static Scanner scanner = new Scanner(System.in);
   private static ShoppingList shoppingList = new ShoppingList();
  
   public static void main (String[] args) {
       boolean quit = false;
       int choice = 0;
       printInstructions();
      
       while(!quit) {
           System.out.println("Enter your choice: ");
           choice = scanner.nextInt();
           scanner.hasNextLine();
          
           switch(choice) {
           case 0:
               printInstructions();
               break;
              
           case 1:
               shoppingList.getShoppingList();
               break;
              
           case 2:
               addItem();
               break;
              
           case 3:
               modifyItem();
               break;
              
           case 4:
               removeItem();
               break;
              
           case 5:
               searchForItem();
               break;
              
           case 6:
               processArrayList();
               break;
              
           case 7:
               quit = true;
               break;
           }
       }
       }
       public static void printInstructions() {
           System.out.println("\nPress");
           System.out.println("\t - To Print The Instructions");
           System.out.println("\t - To Add Item");
           System.out.println("\t - To Modify Item");
           System.out.println("\t - To Remove Item");
           System.out.println("\t - To Search for an Item");
           System.out.println("\t - To Process Array List");
           System.out.println("\t - To Not Continue");
          
       }
      
       public static void addItem() {
           System.out.print("Add : Shopping Item: ");
           shoppingList.addShoppingItem(scanner.nextLine());
          
       }
       public static void modifyItem() {
           System.out.print("Modify: Enter the Item: ");
           String curItem = scanner.nextLine();
          
           System.out.print("Modify: Replace with: ");
           String newItem = scanner.nextLine();
          
           shoppingList.modifyShoppingItem(curItem, newItem);
          
       }
      
       public static void searchForItem() {
           System.out.print("Item Search: ");
           String searchItem = scanner.nextLine();
           if(shoppingList.onFile(searchItem)) {
               System.out.println("Item " + searchItem + " is on the list");
           }
           else {
               System.out.println(searchItem + "Is not found");
           }
       }
       public static void processArrayList() {
           ArrayList<String> newArrayList = new ArrayList<String>();
           newArrayList.addAll(shoppingList.getShoppingList());
          
           ArrayList<String> anotherArrayList = new ArrayList<>(shoppingList.getShoppingList());
          
           String[] myArray = new String[shoppingList.getShoppingList().size()];
           myArray = shoppingList.getShoppingList().toArray(myArray);
       }
public static void setShoppingList(ArrayList<String> shoppingList) {
   this.shoppingList = shoppingList;
           }
  
public void getShoppingList() {
   System.out.println("You have " + shoppingList.size() + " items")
   for(int i=0; i< shoppingListsize(); i++) {
       System.out.println((i+1) + " . " + shoppingList.get(i));
   }
}
public void modifyShoppingItem(String currentItem, String newItem) {
   int position = findItem(currentItem);
   if(position >= 0) {
       modifyShoppingItem(position, newItem);
   }
   }
private void modifyShoppingItem(int position, String item) {
   shoppingList.set(position, item);
   System.out.println("Shopping Item " + (item) + " has been modified");
}
public void removeItem(String item) {
   int position = findItem(item);
   if(position >= 0) {
       removeItem(position);
   }
}
private void removeItem(int position) {
   shoppingList.removeItem(position);
}
private int findItem(String searchItem) {
   return shoppingList.indexOf(searchItem);
}
public boolean onFile(String item) {
   int position = findItem(item);
   if(position >= 0) {
       return true;
   }
   return false;
}
}