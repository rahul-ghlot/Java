import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIfVowel {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "TV";

        // Using java8
        System.out.println(isVowelPresentInString(s1));
        System.out.println(isVowelPresentInString(s2));

        // Using String contains method
        System.out.println(isVowelPresent(s1));
        System.out.println(isVowelPresent(s2));
    }

    public static boolean isVowelPresent(String s) {
        List<String> strlist = Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");
        for (String c : strlist) {
            if (s.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelPresentInString(String s) {
        List<Character> list = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        List<Character> list1 = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        return !list1.stream().filter(list::contains).collect(Collectors.toList()).isEmpty();
    }
}
