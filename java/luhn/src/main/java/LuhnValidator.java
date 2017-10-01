import java.util.stream.IntStream;
import java.util.stream.Stream;

class LuhnValidator {

    boolean isValid(String candidate){
        int[] result;

        candidate = candidate.replaceAll("[^\\d]", "");

        if(candidate.length() < 2) return false;

        result = Stream.of(candidate.split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = result.length-2; i >= 0; i-=2)
            result[i] = result[i] * 2 > 9 ? (result[i] * 2) - 9 : result[i] * 2;

        if(IntStream.of(result).sum() % 10 == 0)
            return true;
        else
            return false;

    }

}
