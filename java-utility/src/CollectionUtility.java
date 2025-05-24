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

    public static List<Employee> getEmployeeList() {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"Alice", 100000000d, "HR",22),
                new Employee(2,"Bob", 20000000d, "Dev",24),
                new Employee(3,"Ankit", 300000000d, "Dev", 25),
                new Employee(4,"Ajay", 200000000d, "HR", 23),
                new Employee(5,"shubham", 600000000d, "HR", 30)
        );
        return emp;
    }

}
