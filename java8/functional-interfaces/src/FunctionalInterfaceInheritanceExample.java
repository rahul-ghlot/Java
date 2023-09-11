
@FunctionalInterface
interface A{
    public void testA();
}

// @FunctionalInterface can not extend another functional interface
interface B extends A{
    public void testB();
}

public class FunctionalInterfaceInheritanceExample {
    public static void main(String[] args) {
        A a = ()->System.out.println("Hello");
    }
}
