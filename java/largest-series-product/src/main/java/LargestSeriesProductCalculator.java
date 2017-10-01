import java.util.stream.Stream;

public class LargestSeriesProductCalculator {

    String series;

    public LargestSeriesProductCalculator(String series) {
        if(series == null)
            throw new IllegalArgumentException("String to search must be non-null.");
        if(!series.matches("^\\d+$") && !series.matches("^$"))
            throw new IllegalArgumentException("String to search may only contain digits.");
        this.series = series;
    }

    public long calculateLargestProductForSeriesLength(int subLength) {
        if(subLength < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if(series.length() < subLength)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(series.equals("") || subLength == 0) return 1;
        long max = 0;
        for(int i = 0; i <= series.length() - subLength; i++) {
            long mult = Stream.of(series.substring(i, i+subLength).split("")).mapToLong(Long::parseLong).reduce(1, (a, b)-> a*b);
            if(mult > max)
                max = mult;
        }
        return max;
    }
}
