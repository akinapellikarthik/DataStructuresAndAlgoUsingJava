import java.util.Arrays;
import java.util.List;

public class MinMaxSubArraySum {
    public static void main(String[] args) {
        /*List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int maxSum = 0, minSum = 0, windowSum = 0;
        int k = 1;
        //print minSum maxSum
        for (int i = 0; i < k; i++) {
            windowSum += arr.get(i);
        }
        for (int end = k; end < arr.size(); end++) {
            //minSum = Math.min(minSum, windowSum);
            windowSum += arr.get(end) - arr.get(end - k);
            System.out.println(windowSum);
            maxSum = Math.max(maxSum, windowSum);
        }

        //System.out.println(minSum + " " + maxSum);
        System.out.println( maxSum);*/

        /*List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = arr.stream().reduce(Integer::sum).get();
        int maxSum =0 , minSum = 0;
        for (Integer integer : arr) {
            var calculatedVal = sum - integer;
            maxSum = Math.max(maxSum, calculatedVal);
            minSum = calculatedVal;
        }
        System.out.println(minSum+" "+maxSum);*/

        //List<Long> arr = Arrays.asList(256741038L,623958417L,467905213L,714532089L,938071625L);
        List<Long> arr = Arrays.asList(793810624L, 895642170L, 685903712L, 623789054L, 468592370L);
        Long sum = arr.parallelStream().reduce(Long::sum).get();
        //arr.stream().map(Double::parseDouble)
        Long maxSum = 0L, minSum = 0L;
        //long maxSum =0 , minSum = 0;
        for (Long integer : arr) {
            Long calculatedVal = sum - integer;

            maxSum = Long.max(maxSum, calculatedVal);
            minSum = Long.min(maxSum, calculatedVal);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
