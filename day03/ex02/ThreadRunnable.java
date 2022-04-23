public class ThreadRunnable implements Runnable {
    private final int   index;
    private final int   from;
    private final int   to;
    private int         sum;
    CommonResource      resource;

    public ThreadRunnable(int index, CommonResource resource) {
        this.resource = resource;
        this.index = index + 1;
        this.from = index * resource.getStep();
        if (this.index == resource.getThreadsCount()) {
            this.to = resource.getArraySize() - 1;
        } else {
            this.to = this.index * resource.getStep() - 1;
        }
        this.sum = 0;
    }

    public void run() {
        for (int i = from; i <= to; i++) {
            sum += resource.getArray()[i];
        }
        resource.addToSum(sum);
        System.out.printf("Thread %d: from %d to %d sum is %d\n", index, from, to, sum);
    }
}
