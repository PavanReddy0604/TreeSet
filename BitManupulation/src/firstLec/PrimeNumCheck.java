package firstLec;

import java.util.HashSet;

//TC is O(sqrt(n))
public class PrimeNumCheck {
	static boolean primeCheck(int n) {

		int count = 0;
		for (int i = 1; i * i <= n; i++) {  //using Math.sqrt(n) increses the TC to O(sqrt(n)*logn)
			if (n % i == 0) {
				count++;
				if (n / i != i) {
					count++;
				}
			}
		}
		System.out.println("number of factors are "+count);
		if (count == 2)
			return true;
		return false;

	}

	public static void main(String[] args) {
		if (primeCheck(16)) {
			System.out.println("prime number");
		} else
			System.out.println("not a prime number ");

		HashSet<Integer> set=new HashSet();
		set.size();
		
	}

}
