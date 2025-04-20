import java.util.Arrays;
import java.util.List;

public class NumberOfOccurrencesOfGivenWord {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";
        Long count = strings.stream().flatMap(e -> Arrays.stream(e.split(" ")))
                .filter(w -> w.equals(word)).count();
        System.out.println(count);
    }
}
