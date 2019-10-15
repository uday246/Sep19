package Sep5th;

public class Primes {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// counter
		int count=0;
		
		boolean primeFlags[] = new boolean[n+1]; 
		// updating all values 2 true
        for(int i=0;i<n;i++) 
            primeFlags[i] = true; 
          
        // iterating through the 
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(primeFlags[p] == true) 
            { 
                // Update all multiples of p 
            	// so remaining numbers will be the primes
                for(int i = p*2; i <= n; i += p) 
                    primeFlags[i] = false; 
            } 
        } 
          
        // couting  the number of primes
        for(int i = 2; i <= n; i++) 
        { 
            if(primeFlags[i] == true) 
            	count++;
        } 
		System.out.println("There are "+count+" primes less than or equal to "+n);
	}
}
