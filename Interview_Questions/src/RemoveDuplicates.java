import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void removeDuplicates(List<Integer> nums){
        List<Integer> values = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("The List without Duplicates");

        for(int num : values){
            System.out.print(num +" ");
        }
    }

    public static void main(String[] args) {
        removeDuplicates(Arrays.asList(1,3,2,9,5,3,4,5,6,7,8,9));
    }
}
