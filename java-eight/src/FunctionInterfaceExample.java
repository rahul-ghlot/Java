import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface FunctionInterfaceExample {
    public static void main(String[] args) {
        Function<Integer, Integer> function = i->i*2;
        List<Integer> oldList = Arrays.asList(1,2,3,4,5);
        List<Integer> newList = oldList.stream().map(function).collect(Collectors.toList());
        System.out.println("oldList : "+oldList);
        System.out.println("newList : "+newList);
    }
}
