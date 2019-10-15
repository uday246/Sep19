
public class SafetyFeatures {
public static void main(String[] args) {
	int carYear;
	carYear=1995;
	//checking it is before 1967
	if(carYear<1967)
		System.out.println("Probably has few saferty features");
	//checking it is after 1969
	if(carYear>1969)
		System.out.println("Probably has head rests");
	//checking it is after 1990
	if(carYear>1990)
		System.out.println("Probably has electronic stability control");
	//checking it is after 2001
	if(carYear>2001)
		System.out.println("Probably has air bags");
}
}
