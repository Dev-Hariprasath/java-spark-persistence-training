import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstElementGreaterValue {
    public static void GreaterValue(List<Integer> nums){
        int val = nums.stream()
                .filter(x -> x > 50)
                .collect(Collectors.toList())
                .get(0);

        System.out.println("The First Element Greater than 50 is " +val);
    }

    public static void main(String[] args) {
        GreaterValue(Arrays.asList(12,34,5,67,78,89,9,24,56,78));
    }
}
