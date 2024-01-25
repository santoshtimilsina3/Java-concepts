package PerfomanceMonitoring;

public class Main {
    /* put -XX:+PrintCompilation --> in VM argument to seee the native code
    put -XX:+PrintCodeCache --> in VM argument to see the CodeCache Size
    put -XX:ReservedCodeCacheSize=20m  --> in VM argument to increase  the CodeCache Size
    put --XX:CICompilerCount=4 to increase/decrease the no.of thread that compiles our code
    put --XX:CompilerThreshold=4 to increase/decrease the times that the compiler changes to native compile if it runs multiple times
    * */
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);
    }

}
