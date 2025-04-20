import java.util.Arrays;
import java.util.List;

public class Test {
    public static void calculationOnList(List<Integer> list, CustomCalculationFunctionalInterface cal) {
        for (Integer i : list) {
            System.out.println(cal.calculation(i));
        }
    }

    public static void main(String[] args) {
        CustomCalculationFunctionalInterface square = i -> i * i;
        CustomCalculationFunctionalInterface increaseAge = i -> i + 5;
        List<Integer> intLst = Arrays.asList(2, 4, 6, 8, 10);
        Test.calculationOnList(intLst, square);
        Test.calculationOnList(intLst, increaseAge);
    }
}
