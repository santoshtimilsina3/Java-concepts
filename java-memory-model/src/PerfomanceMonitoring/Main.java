package PerfomanceMonitoring;

public class Main {
    /* put -XX:+PrintCompilation --> in VM argument to seee the native code
    put -XX:+PrintCodeCache --> in VM argument to see the CodeCache Size
    put -XX:ReservedCodeCacheSize=20m  --> in VM argument to increase  the CodeCache Size

    * */
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);
    }

}
