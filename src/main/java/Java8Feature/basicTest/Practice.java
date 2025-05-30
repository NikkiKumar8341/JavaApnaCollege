package Java8Feature.basicTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        int[] array2={1,8,5,6,3,4,10};

        List<Integer> sum2 = Arrays.stream(array2).boxed().map(n -> n*2).collect(Collectors.toList());

        System.out.println(sum2);
    }
}
