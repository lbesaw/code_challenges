import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Sieve {
    int maxPrime;
    ArrayDeque<Integer> range = new ArrayDeque<>();
    Sieve(int maxPrime) {
        IntStream.range(2, maxPrime+1).forEach(a -> range.add(a));
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        boolean flag = true;
        List<Integer> result = new ArrayList<>();
        Integer operand = null;
        do {
            if(operand != null) {
                result.add(operand);
                for (int i = operand * 2; i <= maxPrime; i += operand) {
                    range.remove(i);
                }
            }
            operand = range.poll();
        } while(operand != null);
        return result;
    }
}
