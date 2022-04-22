public class MyRunnable implements Runnable {
    private final int       count;
    private final String    msg;
    public static boolean   isEggPrinted = false;
    final CommonResource          resource;

    public MyRunnable(int count, String msg, CommonResource resource) {
        this.count = count;
        this.msg = msg;
        this.resource = resource;
    }

    public synchronized void run() {
        synchronized (resource) {
            for (int i = 0; i < count; i++) {
                if (resource.count == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println(msg);
                    resource.count = 1;
                    notify();
                } else {
                    System.out.println(msg);
                    resource.count = 0;
                    notify();
                }
            }
        }
    }
};