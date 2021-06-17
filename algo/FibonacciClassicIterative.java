package algo;

public class FibonacciClassicIterative extends FibonacciParent implements FibonacciInterface {
    @Override
    public int fibonacci(int index) {
        int buff;

        if (sequence.size() < index + 1) {
            for (int i = 2; i <= index; i++) {
                buff = sequence.get(i - 2) + sequence.get(i - 1);
                sequence.add(buff);
            }
        }
        return sequence.get(index);
    }
}
