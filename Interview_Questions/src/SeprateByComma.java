import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeprateByComma {
    public static void separateByComma(List<String> words){
        String word = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(word);
    }

    public static void main(String[] args) {
        separateByComma(Arrays.asList("My", "name", "is", "Hariprasath"));
    }
}
