import java.util.LinkedList;

/*
 * What is the largest prime factor of the number 600851475143?
 * 
 */
public class ProblemThree {
	
	public static long getLargestFactor(long number, long max) {
		for(long i = 2L; i*i < number; i++) {
			if(number % i == 0) {
				if(i > max)
					max = i;
				return getLargestFactor(number/i,max);
			}
		}
		return max;
	}
	

	
	public static void main(String[] args) {
		long num = 600851475143L;
		System.out.println(getLargestFactor(num,0));
	}

}
