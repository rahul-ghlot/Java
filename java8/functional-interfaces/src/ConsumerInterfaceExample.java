import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println("Mr. "+name);
        List<String>  nameList = Arrays.asList("Rahul", "Rohan", "Rakesh");
        nameList.forEach(consumer);
    }

}
