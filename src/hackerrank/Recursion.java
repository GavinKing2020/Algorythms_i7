package hackerrank;

public class Recursion {

    public static void hi(int n) {
        if (n == 0) {
            System.out.println("Bye!");
            return;
        }
        System.out.println("Hi!");
        hi(n-1);
    }

    public static void main(String[] args) {
        hi(3);
    }
}
