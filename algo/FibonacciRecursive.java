package algo;

public class FibonacciRecursive extends FibonacciParent implements FibonacciInterface {

    @Override
    public int fibonacci(int index) {
        if(index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            if (sequence.size() < index + 1) {
                sequence.add(fibonacci(index - 1) + fibonacci(index - 2));
            }
            return sequence.get(index);
        }
    } 
    
}
