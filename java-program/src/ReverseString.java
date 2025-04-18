public class ReverseString {
    public static void main(String[] args) {
        String str = "12345";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        char c [] = str.toCharArray();
        int length = str.length();
        for(int i=0; i < length/2; i++)
        {
            char temp = c[i];
            c[i] = c[length-i-1];
            c[length-i-1] = temp;
        }
        System.out.println(new String(c));
    }
}
