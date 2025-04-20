import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesEachCharacterOfString {
    public static void main(String[] args) {
        String someString = "java programmer";
        Map<Character, Long> map = someString.chars().mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key, value)-> System.out.println(key +" "+ value));
    }
}
