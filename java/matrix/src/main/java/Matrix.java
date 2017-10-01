import java.util.stream.Stream;

public class Matrix {

    String matrixAsString;
    public Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    public int getRowsCount() {
        return matrixAsString.split("\n").length;
    }

    public int getColumnsCount() {
        return matrixAsString.split("\n")[0].split(" ").length;
    }

    public int[] getRow(int index) {
        return Stream.of(matrixAsString.split("\n")[index].split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public int[] getColumn(int index) {
        int[] result = new int[getRowsCount()];
        for(int i = 0;i < getRowsCount();i++)
            result[i] = getRow(i)[index];
        return result;
    }
}
