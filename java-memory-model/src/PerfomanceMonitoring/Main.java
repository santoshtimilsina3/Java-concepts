package PerfomanceMonitoring;

public class Main {
/* put -XX:+PrintCompilation
in VM argument to seee the native code
* */
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
	}

}
