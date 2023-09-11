import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        Comparator<Integer> reverseSort = (i1,i2) -> i2-i1;
        List<Integer> list = Arrays.asList(5,2,7,3,4,9,1);
        Collections.sort(list, reverseSort);
        list.stream().forEach(System.out::println);
    }
}
