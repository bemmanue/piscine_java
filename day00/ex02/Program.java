import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int number = 0;
        while (true) {
            number = in.nextInt();
            if (number == 42)
                break;
            if (isPrime(getSumOfDigits(number)))
                count++;
        }
        System.out.println("Count of coffee-request - " + count);
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
