import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //[[11, 2, 4], [4, 5, 6], [10, 8, -12]]
        System.out.println("Hello");
        List<Integer> row1 = Arrays.asList(11, 2, 4);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(10, 8, -12);

        List<List<Integer>> inputList = Arrays.asList(row1, row2, row3);
        int listSize = inputList.size();
        int d1Sum = 0;
        int d2Sum = 0;
        for (int i = 0; i < listSize; i++) {
            d1Sum += inputList.get(i).get(i);
            d2Sum += inputList.get(i).get(listSize - i - 1);
        }

        int result = d1Sum - d2Sum;
        System.out.println(result >= 0 ? result : result * -1);
    }
}
