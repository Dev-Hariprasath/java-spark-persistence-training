import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ThirdHighestSalary {
    public static void findThirdHighestSalary(List<Integer> nums){
        int num = nums
                .stream()
                .distinct()
                .skip(2).findFirst().get();

        System.out.println("The 3rd Highest Number is " +num);
    }

    public static void main(String[] args) {
        findThirdHighestSalary(Arrays.asList(31,12,43,22,51,9,73,28,19));
    }
}
