package hackerrank;

public class FibonachchiCode {

    // 0 - 0
    // 1 - 1
    // 2 - 1
    // 3 - 3
    // 4 - 3
    // 5 - 7
    // 6 - 9




    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(2)); //1
        System.out.println(fibonacci(3)); //2
        System.out.println(fibonacci(4)); //3
        System.out.println(fibonacci(5)); //5
        System.out.println(fibonacci(6)); //8

    }
}
