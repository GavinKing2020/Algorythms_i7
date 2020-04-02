package hackerrank;

public class Factorial {


//    https://stackoverflow.com/questions/8183426/factorial-using-recursion-in-java
    public static int fact(int n)
    {
        int result;
        if(n==0 || n==1)
            return 1;

        result = fact(n-1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
