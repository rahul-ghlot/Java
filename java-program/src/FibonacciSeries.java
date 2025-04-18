public class FibonacciSeries {

    public static int fibonacci(int num){
        if(num <=1 )
           return num;
       return fibonacci(num -1) + fibonacci(num-2);
    }
    public static void main(String[] args) {

        // Recursive approach
        int count = 10;
        for(int i=0; i<count ; i++){
            System.out.println(fibonacci(i));
        }

        int prevNum = 0;
        int nextNum = 1;
        for (int i=0; i<count; i++){
            System.out.println(prevNum);
            int temp = prevNum;
            prevNum = nextNum;
            nextNum = temp + nextNum;
        }
    }
}
