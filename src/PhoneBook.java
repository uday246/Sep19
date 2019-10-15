
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) throws IOException {

		PhoneBook obj = new PhoneBook();

		PhoneContact[] phBook = new PhoneContact[20];

		Scanner in = new Scanner(System.in);

		obj.acceptPhoneContact(phBook, in);

		PrintWriter pw = new PrintWriter("out.txt");

		obj.displayPhoneContacts(phBook, pw);

		pw.close();

	}

	public void acceptPhoneContact(PhoneContact[] phBook, Scanner k) { // void
																		// function
																		// that
																		// takes
																		// in
																		// the
																		// parameters

		// phBook array and the scanner so the user can input the information

		// declaring these variables

		String fname = "";

		String lname = "";

		String contact = "";

		String option = "";

		System.out.println("Do you have any new contacts to enter? Enter zzz to exit. ");

		option = k.next(); // enter yes or no and the output is stored in the
							// option variable

		int count = 0; // initialize count to 0

		if (phBook[0] != null) { // this checks if the phBook is empty or not

			count = getCurrentContactCount(phBook); // if yes, it will display
													// an integer and value
													// assigned to count

		}

		else {// if not, the phone book is empty and a message will be displayed
				// saying that its empty

			System.out.println("Phone book is empty");

			count = 0;

		}

		while (!(option.contentEquals("zzz")) && count <= 20) { // while loop
																// that will
																// continue to
																// ask

			// the user for more contacts if there are not 20 contacts already
			// and if the user does not enter zzz

			System.out.println("Enter first name: ");

			fname = k.next(); // after entering in the name; it stores it in the
								// fname variable

			System.out.println("Enter last name: ");

			lname = k.next();

			System.out.println("Enter phone number: ");

			contact = k.next();

			if (option.contentEquals("zzz")) {

				break;

			}

			if (phBook[0] != null) { // if this is not empty it will look for a
										// contact

				if (searchContact(phBook, fname, lname, contact) != null) {// if
																			// this
																			// is
																			// not
																			// empty,
																			// it'll
																			// say
																			// the
																			// contact
																			// exists

					System.out.println("Contact exists");

					System.out.println(searchContact(phBook, fname, lname, contact));

					break;

				} else {// otherwise it will add the contact to the phone book

					phBook[count] = new PhoneContact(fname, lname, contact);

					count++;

					if (count >= 20) {

						System.out.println("You have reached the maximum number of contacts.");

						break;

					}

				}

			}

			else {// if the phone book array is empty then it will print that
					// the phone book is empty and add the contact

				System.out.println("Phone book is empty");

				phBook[count] = new PhoneContact(fname, lname, contact);

				count++;

			}

			System.out.println("Do you have any new contacts to enter? ");

			option = k.next();

		} // ends while loop; if the user wants to exit and no longer enter in
			// contacts they will type zzz

		System.out.println("The phone book has " + count + " contacts");

	}

	public int getCurrentContactCount(PhoneContact[] phBook) {

		int numContacts = 0;

		for (int a = 0; a < phBook.length; a++) {

			if (phBook[a] != null) {

				numContacts++;

			}

		}

		return numContacts;

	}

	public PhoneContact searchContact(PhoneContact[] phBook, String fname, String lname, String phone) {

		PhoneContact contact = null;

		for (int a = 0; a < phBook.length; a++) {

			if (phBook[a] != null && phBook[a].getfirstName().equals(fname)) {// compare
																				// lname
																				// and
																				// phone
																				// contact

				System.out.println("Phone book conatct exists");

				contact = phBook[a];

				break;

			}

		}

		return contact;

	}

	public void displayPhoneContacts(PhoneContact[] phBook, PrintWriter pw)

			throws IOException {

		pw.println("Phone Book");

		pw.println("**************************");

		pw.print("First Name\tLast Name\t Contact number");

		for (int a = 0; a < phBook.length; a++) {

			pw.println(phBook[a].getfirstName() + "\t" + phBook[a].getlastName() + "\t" + phBook[a].getphoneNumber());

		}

	}

}