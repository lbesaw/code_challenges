import java.util.stream.IntStream;

class SumOfMultiples {

    int number;
    int[] set;
    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        return IntStream.range(1, number).filter(this::isMultiple).sum();
    }

    boolean isMultiple(int current) {
        for(int factor : set) {
            if(current % factor == 0)
                return true;
        }
        return false;
    }
}
