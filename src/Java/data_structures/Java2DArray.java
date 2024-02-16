package Java.data_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        getTheLargestSum(arr);
    }

    private static void getTheLargestSum(List<List<Integer>> list) {
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() - 2; i++) {
            List<Integer> first = list.get(i);
            List<Integer> second = list.get(i+1);
            List<Integer> third = list.get(i+2);

            for (int j = 0; j < first.size() - 2; j++) {
                int firstListVal1 = first.get(j);
                int firstListVal2 = first.get(j+1);
                int firstListVal3 = first.get(j+2);
                int secondListVal = second.get(j+1);
                int thirdListVal1 = third.get(j);
                int thirdListVal2 = third.get(j+1);
                int thirdListVal3 = third.get(j+2);

                int sum = firstListVal1 + firstListVal2 + firstListVal3 + secondListVal + thirdListVal1 + thirdListVal2 + thirdListVal3;
                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        System.out.println(largestSum);
    }
}
