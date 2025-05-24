import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void calculationOnList(List<Integer> list, CustomCalculationFunctionalInterface cal) {
        for (Integer i : list) {
            System.out.println(cal.calculation(i));
        }
    }


    public static void findCharOccurances(){
        String inputString = "Java Concept Of The Day";
        inputString = inputString.replace(" ", "");
        inputString = inputString.toLowerCase();

        Map<Character, Long> map = inputString.chars().mapToObj(i->(char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(e-> e.getValue() > 1).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()))
                .forEach((k, v)->System.out.println(k + " " + v));

        Map.Entry<Character, Long> maxentry = map.entrySet().stream().max( (c1, c2) -> c1.getValue().compareTo(c2.getValue())
        )                .orElse(null);

        if(maxentry != null){
            System.out.println("start");
            System.out.println(maxentry.getKey() + " " + maxentry.getValue());
        }

    }

    public static void findListofEmpMaxSalary(){
      Employee e1 = new Employee(1, "A", Double.valueOf(10000000), "HR",22);
      Employee e2 = new Employee(2, "C", Double.valueOf(20000000), "Dev", 24);
      Employee e3 = new Employee(3, "B", Double.valueOf(10000000), "HR",23);
      Employee e4 = new Employee(4, "T", Double.valueOf(10000000), "Infra",21);
      Employee e5 = new Employee(5, "D", Double.valueOf(50000000), "Architect",30);
      Employee e6 = new Employee(6, "F", Double.valueOf(20000000), "Dev",25);
      List<Employee> list =  Arrays.asList(e1,e2,e3,e4,e5);

      Employee e = list.stream().max((e11,e22)-> e11.salary.compareTo(e22.salary)).orElse(null);



        Map<Double, List<Employee>> empMap =
                list.stream().collect(Collectors.groupingBy(emp ->emp.salary));
        System.out.println(empMap);


    }


    public static void main(String[] args) {
       /* CustomCalculationFunctionalInterface square = i -> i * i;
        CustomCalculationFunctionalInterface increaseAge = i -> i + 5;
        List<Integer> intLst = Arrays.asList(2, 4, 6, 8, 10);
        Test.calculationOnList(intLst, square);
        Test.calculationOnList(intLst, increaseAge);*/

        //findCharOccurances();
        findListofEmpMaxSalary();
    }
}
