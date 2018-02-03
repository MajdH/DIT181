package theArray;
import java.math.BigInteger;
import java.util.HashMap;


public class tr {
	

	private static HashMap<BigInteger, BigInteger> memorized = new HashMap<>();

	public static BigInteger fib(int n) {
		if ( memorized.containsKey( n ) ) {
            return memorized.get( n );
        }
		
	 if (n <= 1) return BigInteger.ONE;
	 else {
		 BigInteger nFibonacciNumber = fib( n - 2 ).add(fib( n - 1 ));

         // insert it into our look-up table
         memorized.put(nFibonacciNumber, fib(n-1));

         return nFibonacciNumber;
	 }
	 
	
}
}