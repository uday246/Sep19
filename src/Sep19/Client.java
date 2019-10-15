package Sep19;

/**
 * Maintains information on an insurance client.
 *
 * @author Doyt Perry/<add your name here>
 * @version Fall 2019
 */
public class Client {
	// instance variables
	private String lastName;
	private String firstName;
	private int age;
	private int height;
	private int weight;

	/**
	 * First constructor for objects of class Client.
	 */
	public Client() {
		// initialize all instance variables to placeholder values
		this.lastName = "last name";
		this.firstName = "first name";
		this.age = 0;
		this.height = 1;
		this.weight = 1;
	}

	/**
	 * Second constructor for objects of class Client.
	 *
	 *
	 * Create a client object using explicit parameters to specify values for
	 * corresponding instance fields.
	 *
	 * @param inLastName
	 *            last Name of client
	 * @param inFirstName
	 *            first Name of client
	 * @param inAge
	 *            age of client
	 * @param inHeight
	 *            height of client
	 * @param inWeight
	 *            weight of client
	 */
	public Client(String inLastName, String inFirstName, int inAge, int inHeight, int inWeight) {
		// initialize instance variables
		// using values passed in as parameters
		this.lastName = inLastName;
		this.firstName = inFirstName;
		this.age = inAge;
		this.height = inHeight;
		this.weight = inHeight;
	}

	/**
	 * Update the last name of the client.
	 *
	 * @param inLastName
	 *            last name of the client.
	 */
	public void setLastName(String inLastName) {
		// Set the last name instance variable to parameter
		this.lastName = inLastName;
	}

	/**
	 * Return the last name of the client.
	 *
	 * @return String last name.
	 */
	public String getLastName() {
		// return the value of the last name instance variable
		return this.lastName;
	}

	/**
	 * Update the first name.
	 *
	 * @param inFirstName
	 *            first name of the client.
	 */
	public void setFirstName(String inFirstName) {
		// Set the first name instance variable to parameter.
		// REPLACE this comment with your code
		firstName = inFirstName;
	}

	/**
	 * Return the first name of the client.
	 *
	 * @return String first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	// return "not cor";

	/**
	 * Update the age of the client.
	 *
	 * @param inAge
	 *            age of the client.
	 */
	public void setAge(int inAge) {
		// Set the age instance variable to the parameter
		this.age = inAge;
	}

	/**
	 * Return the age of the client.
	 *
	 * @return int first name.
	 */
	public int getAge() {
		// return the value of the first age instance variable.
		return this.age;
	}

	/**
	 * Update the height of the client.
	 *
	 * @param inHeight
	 *            height of the client.
	 */
	public void setHeight(int inHeight) {
		// Set the height instance variable to the parameter
		this.height = inHeight;
	}

	/**
	 * Return the height of the client.
	 *
	 * @return int height of client.
	 */
	public int getHeight() {
		// return the value of the height instance variable.
		return this.height;
	}

	/**
	 * Update the weight of the client.
	 *
	 * @param inWeight
	 *            weight of the client.
	 */
	public void setWeight(int inWeight) {
		weight = inWeight;
		// replace this comment with your code
	}

	/**
	 * Return the weight of the client.
	 *
	 * @return int weight of client.
	 */
	public int getWeight() {
		return weight;
		// replace this comment & return statement with your code
	}

	/**
	 * Calculate the BMI of the client.
	 *
	 * @return double BMI of client.
	 */
	public double calcBMI() {
		// return the result of calculating the BMI.
		// Refer to "Common Error 4.1" on page 142 in the textbook for more info
		// if WebCat flags the following calculation as an error.
		return (704 * this.weight) / this.height * this.height;
	}

	/**
	 * Display the client information.
	 *
	 * @return String formatted client informatin.
	 *
	 *         <pre>
	* The label should be printed in the format:
	*
	* last name, first name
	* Age: 99
	* BMI: 99.999
	 *         </pre>
	 */
	public String toString() {
		// initialize the variable that will hold the output string
		String output = "";

		// put the name in lastname, firstname format
		output = output + this.lastName + this.firstName + "\n";

		// include the client age
		output = output + "Age " + this.age + "\n";

		// include the email address
		output = output + "BMI " + this.calcBMI() + "\n";

		// return the output string
		return output;
	}
}