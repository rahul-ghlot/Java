import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtility {
    public static Map<Integer, String> testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Virat");
        map.put(2, "Rohit");
        map.put(3, "Dhoni");
        map.put(4, "Sachin");
        map.put(5, "Sehwag");
        return map;
    }

    public static List<Student> getStudentList() {
        Student s1 = new Student(2, "A");
        Student s2 = new Student(4, "B");
        Student s3 = new Student(3, "D");
        Student s4 = new Student(1, "C");
        Student s5 = new Student(3, "A");

        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        return list;
    }

}
