import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void squareNumbers(List<Integer> num){
        List<Integer> values = num
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("The Squared Number are");
        for (int i = 0; i <num.size(); i++) {
            System.out.println("The Actual Value is " + num.get(i) +" and squared value are " +values.get(i));
        }
    }

    public static void main(String[] args) {
        squareNumbers(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }
}
