import java.util.Scanner;

public class ComputeFibonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        System.out.println(fibonachi(n));
    }
    public static long fibonachi(long i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else return (fibonachi(i - 1) + fibonachi(i - 2));
    }
}
