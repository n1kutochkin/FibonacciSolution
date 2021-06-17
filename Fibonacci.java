import java.util.ArrayList;

import algo.FibonacciClassicIterative;
import algo.FibonacciInterface;
import algo.FibonacciRecursive;
public class Fibonacci {

    private static ArrayList<Integer> sequence = new ArrayList<>();

    static {
        sequence.add(0);
        sequence.add(1);
    }
    public static void main(String[] args) {

        FibonacciInterface fibonacciIter = new FibonacciClassicIterative();
        FibonacciInterface fibonacciRec = new FibonacciRecursive();

        System.out.println(fibonacciRec.fibonacci(6));
        System.out.println(fibonacciRec.fibonacci(4));
        System.out.println(fibonacciIter.fibonacci(6));
        System.out.println(fibonacciIter.fibonacci(4));
        
    }
}
