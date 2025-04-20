import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SegregateAnagramGroups {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> group = new HashMap<>();

        // old approach
        for (String str : list) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            if (group.containsKey(sortedString)) {
                List<String> tempList = group.get(sortedString);
                tempList.add(str);
                group.put(sortedString, tempList);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                group.put(sortedString, tempList);
            }
        }
         group.forEach((key, value)-> System.out.println(key + ":" + value));

        // using java8
        Collection<List<String>> l = list.stream().collect(Collectors.groupingBy(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            return new String(chars); // sorted word as key
        })).values();
    }
}
