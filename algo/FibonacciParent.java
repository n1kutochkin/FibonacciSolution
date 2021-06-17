package algo;

import java.util.ArrayList;

public abstract class FibonacciParent {
    protected ArrayList<Integer> sequence = new ArrayList<>();

    FibonacciParent() {
        sequence.add(0);
        sequence.add(1);
    }
}
