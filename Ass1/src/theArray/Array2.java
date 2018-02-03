package theArray;
import java.lang.reflect.Array;
import java.util.Arrays;


class Array2 {
	  private final int max_elements = 200;
	  private int size = 0;
	  private int[] arr;

	  public Array2(int n) {
	    if (n < 0 || n > max_elements)
	      throw new IllegalArgumentException("Array size must be non-negative");
	    arr = new int[max_elements];
	    size = n;
	  }

	  public int size() {
	    return size;
	  }

	  // Set the i-th element to x
	  // We are not checking whether the index is
	  // in bounds, because dereferencing the array
	  // element does it for us.
	  public void set(int i, int x) {
	    arr[i] = x;
	  }

	  // Get the i-th element
	  // Again, we are not checking if the index
	  // is in bounds.
	  public int get(int i) {
	    return arr[i];
	  }

	  // Reverse the array
	  public void reverse() {
		  for(int i = 0; i <= arr.length / 2; i++) {
			  int temp = arr[i];
			  arr[i] = arr[arr.length - i -1];
			  arr[arr.length - i] = temp;
		  }
	  }
	  // O(log n)

	  // Find the maximum odd number in the array. Return -1
	  // if there are no odd numbers.
	  public int maxOdd() {
		  int max = 0;
		  for( int i = 0; i < arr.length; i++) {
			 if(arr[i] % 2 == 0) {
				 i++;
			 }else {
				 if(arr[i] > max) {
					 max = arr[i];
				 }
			 }
		  }
	    return max;
	  }
	  // O(N)

	  // Remove the element of index i from the array.
	  public void remove(int i) {
		  int [] temp = new int [arr.length-1];
		  for (int j = 0; j < arr.length; j++) {
			  if(arr[j] == i) {
				  j++;
			  }else {
				  temp[j] = arr [j];
			  }
		  }
		  arr = temp;
	  }

	  // Remove the element of index i from the array.
	  // This method may change the order of the other
	  // elements of the array.
	  public void removeFast(int i) {
	  }

	  // Return the index of the first occurrence of x in the array,
	  // or -1 if x does not occur.
	  public int find(int x) {
		  int occu = -1;
		  while(occu > -1) {
			  for(int i = 0; i < arr.length; i++) {
				  if(arr[i] == x) {
					  occu = i;
				  }
			  }
		  }
	    return occu;
	  }

	  // Find the length of the longest palindrome that is
	  // a contiguous subsequence of the array. A palindrome
	  // is a word of the form ABCBA (length 5) or ABCCBA
	  // (length 6).
	  public int maxPalindrome() {
	    return 0;
	  }

	  // Return the maximum sum of all contiguous subarrays of the array.
	  public int maxInterval() {
	    return 0;
	  }

	  // Return the index of the lowest element of the array,
	  // assuming that the array contains a cyclic shift of
	  // a non-decreasing sequence.
	  public int findSplice() {
		  
	    return 0;
	  }

	  // Return the median value of an array.
	  public int median() {
	    return 0;
	  }
	  public String toString() {
		    StringBuilder res = new StringBuilder("{");
		    if (size > 0) {
		      res.append(arr[0]);
		      for (int i = 1; i < size; ++i) {
		        res.append(", ");
		        res.append(arr[i]);
		      }
		    }
		    res.append("}");
		    return res.toString();
		  }
	
public static void main (String[] args) {
    Array2 a = new Array2(3);
    a.set(0, 4);
    a.set(1, 2);
    System.out.println(a.toString());
    System.out.println(a.size);
  }
}
