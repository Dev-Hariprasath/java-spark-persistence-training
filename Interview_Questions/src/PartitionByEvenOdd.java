import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionByEvenOdd {
    public static void partitionByEvenOdd(List<Integer> nums){
        List<Integer> even = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> odd = nums.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers : " +even);
        System.out.println("Odd Numbers : " +odd);
    }

    public static void main(String[] args) {
        partitionByEvenOdd(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }
}
