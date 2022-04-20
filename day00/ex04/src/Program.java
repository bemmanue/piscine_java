import java.util.Scanner;

public class Program {

    final private static char[]     maxOccur = new char[10];
    final private static int[]      charOccur = new int[65535];
    private static int              count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  str = in.nextLine();
        char[]  array = str.toCharArray();

	    for (int i = 0; i < array.length; i++) {
	        if (charOccur[array[i]] < 999) {
                charOccur[array[i]]++;
                if (isWritten(array[i])) {
                    removeElement(array[i]);
                    insertElement(array[i]);
                }
                else {
                    insertElement(array[i]);
                }
            }
        }
	    print();
    }

    public static void print() {
        double  onePart = charOccur[maxOccur[0]] / 10.0;
        int     MAX_LINE = 12;
        int     line = 0;

        while (line < MAX_LINE) {
            int     column = 0;
            while (column < count) {
                if (line == 11) {
                    System.out.printf("%3c", maxOccur[column]);
                }
                else if (line == 10 - (int)(charOccur[maxOccur[column]] / onePart)) {
                    System.out.printf("%3d", charOccur[maxOccur[column]]);
                }
                else if (line > 10 - charOccur[maxOccur[column]] / onePart) {
                    System.out.printf("%3s", "#");
                }
                else {
                    System.out.printf("%3s", " ");
                }
                column++;
            }
            System.out.printf("%s", "\n");
            line++;
        }
    }

    public static void insertElement(char c) {
        if (count == 0) {
            maxOccur[0] = c;
        }
        else {
            int i = 0;
            while (charOccur[c] < charOccur[maxOccur[i]]) {
                if (++i == 10) {
                    return;
                }
            }
            while (charOccur[c] == charOccur[maxOccur[i]]
                && c > maxOccur[i]) {
                if (++i == 10) {
                    return;
                }
            }
            int j = 9;
            while (j > i) {
                maxOccur[j] = maxOccur[j - 1];
                j--;
            }
            maxOccur[i] = c;
        }
        if (count < 10) {
            count++;
        }
    }

    public static void removeElement(char c) {
        if (count > 0)
            count--;
        int i = 0;
        while (c != maxOccur[i]) {
            i++;
        }
        while (i < count) {
            maxOccur[i] = maxOccur[i + 1];
            i++;
        }
        while (i < 10)
        {
            maxOccur[i] = 0;
            i++;
        }
    }

    public static boolean isWritten(char c) {
        for (int i = 0; i < 10; i++) {
            if (c == maxOccur[i]) {
                return true;
            }
        }
        return false;
    }
}
