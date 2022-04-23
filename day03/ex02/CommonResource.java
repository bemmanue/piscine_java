import java.util.Random;

public class CommonResource {
    private final int       threadsCount;
    private final int       arraySize;
    private final int       step;
    private final int[]     array;
    private int             sum = 0;

    public CommonResource(int arraySize, int threadsCount) {
        this.threadsCount = threadsCount;
        this.arraySize = arraySize;
        this.step = arraySize / threadsCount;

        this.array = new int[arraySize];
        Random ran = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = ran.nextInt(2000) - 1000;
        }
    }

    public int getStep() {
        return step;
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getThreadsCount() {
        return threadsCount;
    }

    public int[] getArray() {
        return array;
    }

    public int getSum() {
        return sum;
    }

    public void addToSum(int sum) {
        this.sum += sum;
    }
}
