import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weekNumber = 0;
        long data = 0;

        for (int i = 0; i < 18; i++) {
            String str = in.next();
            if (str.equals("42")) {
                break;
            }
            if (!str.equals("Week")) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            weekNumber = in.nextInt();
            if (weekNumber != i + 1) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            int minGrade = 9;
            for (int j = 0; j < 5; j++) {
                int grade = in.nextInt();
                if (grade < 1 || grade > 9) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if (grade < minGrade)
                    minGrade = grade;
            }
            data += minGrade * pow(10, i);
        }

        for (int i = 1; i <= weekNumber; i++) {
            System.out.print("Week " + i);
            long minGrade = data % 10;
            data /= 10;
            for (int j = 0; j < minGrade; j++) {
                System.out.print("=");
            }
            System.out.println(">");
        }
    }

    public static long pow(int value, int powValue) {
        int result = 1;
        for (int i = 0; i < powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
