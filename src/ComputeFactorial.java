import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a nonnegative integer");
        int n = input.nextInt();
        System.out.println("factorial of " + n + "is" + factorial(n));
    }

    private static long factorial(int n) {
        if (n == 0)
            return 1;
        else return n * factorial(n - 1);
    }
}
