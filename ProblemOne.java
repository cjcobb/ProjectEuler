

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.util.LinkedList;


public class ProblemOne {
	
	public static int findSum(int limit) {
		int sum = 0;
		for(Integer i : formList(limit)) {
			sum += i;
		}
		return sum;
	}
	
	public static LinkedList<Integer> formList(int limit) {
		LinkedList<Integer> multiples = new LinkedList<Integer>();
		for(int i = 0; i < limit; i++) {
			if( i % 3 == 0 || i % 5 == 0)
				multiples.add(i);
			
		}
		return multiples;
	}
	
	public static void main(String[] args) {
		System.out.println(findSum(1000));
	}

}
