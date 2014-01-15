/*
 * Find the sum of all even fibonacci numbers less than 4 million
 */
public class ProblemTwo {
	static int sum = 0;
	
	public static int fibo(int m, int n, int sum) {
		if (n > 4000000)
			return sum;
		if (n % 2 == 0)
			sum += n;
		
		return fibo(n, m+n, sum);
	}
	public static void main(String[] args) {
		System.out.println(fibo(1,2,0));
	}
}
