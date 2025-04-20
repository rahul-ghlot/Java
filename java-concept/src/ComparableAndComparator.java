import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStudentById implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s2.id - s1.id;
    }
}

class SortStudentByName implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.name.compareTo(s2.name);
    }
}

public class ComparableAndComparator {
    public static void main(String[] args) {
        List<Student> list = CollectionUtility.getStudentList();

        System.out.println(list);

        // using comparator
        Collections.sort(list, new SortStudentById());
        System.out.println(list);
        Collections.sort(list, new SortStudentByName());
        System.out.println(list);


       list.sort(Comparator.comparingInt((Student s)->s.id)
               .thenComparing(s -> s.name));
        System.out.println(list);


    }
}
