import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void converttoUpperCase(List<String> names){
        List<String> values = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("The name is converted to uppercase :");
        for(String str : values){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        converttoUpperCase(Arrays.asList("hari", "prasath", "mogan", "maran"));
    }
}
