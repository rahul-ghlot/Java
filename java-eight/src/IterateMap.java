import java.util.Map;

public class IterateMap {
    public static void main(String[] args) {
       Map<Integer, String> map = CollectionUtility.testMap();
       map.computeIfPresent(2, (key, value) -> "Joshua Bloch");
       map.computeIfAbsent(1, (value) -> "Kathy Sierra");
       map.entrySet().forEach(System.out::println);
    }
}
