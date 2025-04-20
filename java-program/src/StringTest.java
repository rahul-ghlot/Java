public class StringTest {
    public static void main(String[] args) {
        String a = "tata";
        String b = a;
        a = "Birla";
        System.out.println(b);

        String a1 =  new String("Tata");
        String b1 = a1;
        a1 = new String("Birla");
        System.out.println(b1);


        System.out.println("*************************************");

        String s3 = "Hello";
        String s4 = new String("Hello");
        String s5 = s4.intern();

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s3 == s5);
        System.out.println(s3.equals(s5));

    }
}
