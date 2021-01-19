public class Primes {

	public static void main (String[] args) {
		for (int i = 2; i < 101; i++) {
			if (Primes.isPrime(i))
				System.out.println(i + " is prime number.");
		}
	}
	
	// простое число или нет
	public static boolean isPrime(int n) {
		if (n <= 1) return false;

		// Классификация числа

		for (int denominator = 2; denominator < n; denominator++) {
			if (n % denominator == 0) return false;
		}

		return true;
	}
}