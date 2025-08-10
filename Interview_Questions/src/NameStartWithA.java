import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWithA {
    public static void nameStartWithA(List<String> names){
        List<String> values = names.stream()
                .filter(name -> name.charAt(0) == 'A')
                .collect(Collectors.toList());

        System.out.println("The Start with A :");
        for (String name : values){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        nameStartWithA(
                Arrays.asList("Hari", "Abinaya", "Dhivya", "Arun", "Akash", "Mogan"));
    }
}
