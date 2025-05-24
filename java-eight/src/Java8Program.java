import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Program {

    //Given a list of integers, separate odd and even numbers?
    public static void separateOddAndEvenNumbers() {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> map = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(listOfIntegers);
    }

    //How do you remove duplicate elements from a list using Java 8 streams?
    public static void removeDuplicateElement() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().distinct().forEach(System.out::println);
    }

    //How do you find frequency of each character in a string using Java 8 streams?
    public static void findFrequencyOfCharacter() {
        String str = "i am java developer";
        str = str.replace(" ", "");
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    //How do you sort the given list of Integer in reverse order?
    public static void sortIntegerInReverseOrder() {
        // List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Integer> integerList = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        Collections.sort(integerList, (a, b) -> b - a);
        System.out.println(integerList);
    }

    //How do you sort the given list of Decimal in reverse order?
    public static void sortDecimalInReverseOrder() {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //Find sum of all digits of a number in Java 8?
    public static void sumOfAllDigit() {
        int i = 15623;
        IntSummaryStatistics sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
        System.out.println(sumOfDigits.getSum());
    }

    public static void findEmpListNameStartWithA(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().filter(e -> e.name.startsWith("A")).forEach(System.out::println);
    }

    public static void groupEmployeeByDeptName(){
        List<Employee> emp = CollectionUtility.getEmployeeList();

        emp.stream().collect(Collectors.groupingBy(e->e.deptName, Collectors.toList()))
                .forEach((k,v)->System.out.println(k+" "+v));
    }

    // Find the max age of employees
    public static void findEmpWithMaxAge(){
        List<Employee> emp = CollectionUtility.getEmployeeList();

       Employee employee = emp.stream().max(Comparator.comparingInt(e->e.age)).get();
       System.out.println(employee);
    }

    //Find all department names
    public static void findAllDepartmentName(){
        List<Employee> emp = CollectionUtility.getEmployeeList();

        emp.stream().map(e->e.deptName).distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    //Find the count of employee in each department
    public static void findCountOFEmpInEachDepartment(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().collect(Collectors.groupingBy(e-> e.deptName , Collectors.toList()))
                .forEach((k,v) -> System.out.println(k + " " + v.size()));
    }

    //Find the list of employees whose age is less than 30
    public static void findEmployeesWithAgeLessThanThirty(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().filter(e ->e.age < 30 ).forEach(System.out::println);
    }

    //Find the list of employees whose age is less than 30
    public static void findEmployeesWithAgeLessThanThirtyOneAndGreaterThanTwentySix(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().filter(e -> e.age > 26 &&  e.age < 31  ).forEach(System.out::println);
    }

    //Find the average age of male and female employee
    public static void findAverageAgeMaleFemaleEmployee(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().collect(Collectors.partitioningBy(e -> "Male".equals(e.gender)))
                .forEach((k,v) -> System.out.println(k + " "+v));
        emp.stream().collect(Collectors.partitioningBy(e -> "Male".equals(e.gender)))
                .forEach((k,v) -> System.out.println(v.stream().mapToInt(e -> e.age).average().getAsDouble()));
    }

    //Find the department who is having maximum number of employee
    public static void findDeptWhoHavingMaxNumberEmp() {
        List<Employee> emp = CollectionUtility.getEmployeeList();
        String dept = emp.stream().collect(Collectors.groupingBy(e -> e.deptName, Collectors.toList()))
                .entrySet().stream().max(Comparator.comparingInt(e -> e.getValue().size()))
                .get().getKey();
        System.out.println(dept);
    }

    //Find the Employee who stays in Delhi and sort them by their names
    public static void findSortedEmpByNameBasedOnCity(String city){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().filter(e -> city.equals(e.city)).sorted(Comparator.comparing(e -> e.name))
                .forEach(System.out::println);
    }

    //Find average salary from each department
    public static void findAverageSalaryFromEachDept(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().collect(Collectors.groupingBy(e->e.deptName, Collectors.toList()))
                .forEach((k,v)-> System.out.println(k +" "+v.stream().mapToDouble(e->e.salary).average().getAsDouble()));

    }

    //Find the highest salary in each department
    public static void findHighestSalaryFromEachDept(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().collect(Collectors.groupingBy(e->e.deptName, Collectors.toList()))
                .forEach((k,v)->System.out.println(k+" "+v.stream().max(Comparator.comparingDouble(e -> e.salary))));
    }

    //Find the list of employee and sort them by their salary
    public static void findEmpSortedBySalary(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        emp.stream().sorted(Comparator.comparingDouble(e -> e.salary))
                .forEach(System.out::println);
    }

    //Find the employee who has second-highest salary
    public static void findSecondHighestSalary(){
        List<Employee> emp = CollectionUtility.getEmployeeList();
        Employee employee =emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(employee);
    }

    public static void main(String[] args) {
        findSecondHighestSalary();
    }

}
