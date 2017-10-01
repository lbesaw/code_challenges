import java.util.stream.IntStream;

class NaturalNumber {

    int number;

    public NaturalNumber(int number) throws IllegalArgumentException {
        if(number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    public Classification getClassification() {


         int summedFactors = IntStream.range(1, number-1).filter(a -> number % a == 0).sum();

         if(summedFactors == number)
             return Classification.PERFECT;
         if(summedFactors < number)
             return Classification.DEFICIENT;
         if(summedFactors > number)
             return Classification.ABUNDANT;

         return null;
    }

}
