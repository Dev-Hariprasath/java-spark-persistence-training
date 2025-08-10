import java.util.Arrays;
import java.util.List;

public class CountElement {
    public static void countElement(List<Integer> nums){
        Long cnt = nums
                .stream()
                .filter( x -> x > 10)
                .count();

        System.out.println("The count of Numbers Greater than 10 are : " +cnt);
    }

    public static void main(String[] args) {
        countElement(Arrays.asList(11,22,33,44,55,66,77,88,99));
    }
}
