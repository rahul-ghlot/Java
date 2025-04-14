import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        // using java8
        if (s1.length() == s2.length()) {
            String str1 = Stream.of(s1.split("")).sorted().collect(Collectors.joining());
            String str2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());

            if (str1.toString().equals(str2.toString())) {
                System.out.println("Strings are Anagram");
            }
        }

        // old approach
        char c1 [] = s1.toCharArray();
        char c2 [] = s2.toCharArray();

        if(c1.length == c2.length){
            Arrays.sort(c1);
            Arrays.sort(c2);
           if(Arrays.equals(c1, c2)) {
               System.out.println("Strings are Anagram");
           }
        }
    }
}
