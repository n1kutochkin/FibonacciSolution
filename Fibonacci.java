import algo.FibonacciClassicIterative;
import algo.FibonacciInterface;
import algo.FibonacciRecursive;

public class Fibonacci {
    public static void main(String[] args) {

        FibonacciInterface fibonacciIter = new FibonacciClassicIterative();
        FibonacciInterface fibonacciRec = new FibonacciRecursive();

        System.out.println(fibonacciRec.fibonacci(6));
        System.out.println(fibonacciRec.fibonacci(4));
        System.out.println(fibonacciIter.fibonacci(6));
        System.out.println(fibonacciIter.fibonacci(4));
        
    }
}
