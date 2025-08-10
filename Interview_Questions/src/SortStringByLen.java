import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortStringByLen {
    public static void sortStringByLength(List<String> names){
        List<String> values = names.stream()
                .distinct()
                .sorted(Comparator.comparing(e -> e.length()))
                .collect(Collectors.toList());

        for(String name : values){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sortStringByLength(Arrays.asList("Hari", "Abinaya", "Dhivya", "Arun", "Akash", "Mogan"));
    }
}
