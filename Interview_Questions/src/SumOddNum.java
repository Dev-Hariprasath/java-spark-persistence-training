import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOddNum {
    public static void sumOfOdd(List<Integer> nums){
        int sum = 0;
        List<Integer> val = nums.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        for(int n : val){
            sum += n;
        }

        System.out.println("The sum of odd number is " + sum);
    }

    public static void main(String[] args) {
        sumOfOdd(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }
}
