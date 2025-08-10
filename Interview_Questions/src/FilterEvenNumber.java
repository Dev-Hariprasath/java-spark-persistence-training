import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void filterEvenNum(List<Integer> nums){
        List<Integer> values = nums.stream()
                .filter( x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("The Even Numbers Are :");
        for(int n : values){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        filterEvenNum(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }
}
