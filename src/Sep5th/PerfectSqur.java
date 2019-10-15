package Sep5th;

public class PerfectSqur {
public static void main(String[] args) {
	for(long i=10;;i++){
		//finding the squre root
		double sr = Math.sqrt(i); 
	      long temp=i;
        // If square root is an integer  than it is called as perfect square
         if (((sr - Math.floor(sr)) == 0)){
        	 // As it is perfect squre need to check if last 2 digits are odd;
        	 //extracting last digit
        	 long d1=temp%10;
        	 //removing last digit
        	 temp=temp/10;
        	 //extracting last but one digit
        	 long d2=temp%10;
        	 //checking if both are odd
        	 if(d1%2==1 && d2%2==1){
        		 System.out.println("The number is : "+i);
        		 break;
        	 }
         }
	}
}
}
