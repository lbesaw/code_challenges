import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int target) {
        return (int) Math.pow(IntStream.range(0, target+1).sum(), 2);
    }
    public int computeSumOfSquaresTo(int target) {
        return IntStream.range(0, target+1).reduce(0, (a, b) -> a + (int) Math.pow(b, 2));
    }
    public int computeDifferenceOfSquares(int target) {
        return Math.abs(this.computeSumOfSquaresTo(target) - this.computeSquareOfSumTo(target));
    }
}
