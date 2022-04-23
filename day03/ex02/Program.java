public class Program {

    public static void main(String[] args) {
        int arraySize = 0;
        int threadsCount = 0;

        if (args.length != 2 || !args[0].startsWith("--arraySize=")
                || !args[1].startsWith("--threadsCount=")) {
            System.out.println("Wrong arguments");
            System.exit(-1);
        } else {
            try {
                arraySize = Integer.parseInt(args[0].substring(12));
                threadsCount = Integer.parseInt(args[1].substring(15));
            }
            catch (Exception e) {
                System.out.println("Wrong arguments");
                System.exit(-1);
            }
        }
        if (arraySize > 2000000 || threadsCount <= 0 || threadsCount > arraySize) {
            System.out.println("Wrong arguments");
            System.exit(-1);
        }

        CommonResource resource = new CommonResource(arraySize, threadsCount);

        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum += resource.getArray()[i];
        }
        System.out.printf("Sum: %d\n", sum);

        ThreadRunnable[] threadArr = new ThreadRunnable[arraySize];
        Thread[] threads = new Thread[arraySize];

        for (int i = 0; i < threadsCount; i++) {
            threadArr[i] = new ThreadRunnable(i, resource);
            threads[i] = new Thread(threadArr[i]);
            threads[i].start();
        }

        for (int i = 0; i < threadsCount; i++) {
            try {
                threads[i].join();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Sum by threads: %d\n", resource.getSum());
    }
}
