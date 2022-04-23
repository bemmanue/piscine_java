import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;

        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        result++;
        if (number <= 3) {
            System.out.println("true " + result);
            System.exit(0);
        }
        result++;
        if (number % 2 == 0) {
            System.out.println("false " + result);
            System.exit(0);
        }
        result++;
        if (number % 3 == 0) {
            System.out.println("false " + result);
            System.exit(0);
        }
        result++;
        for (int i = 5; i * i <= number; i = i + 6) {
            result++;
            if (number % i == 0) {
                System.out.println("false " + result);
                System.exit(0);
            }
            result++;
            if (number % (i + 2) == 0) {
                System.out.println("false " + result);
                System.exit(0);
            }
        }
        System.out.println("true " + result);
    }
}
