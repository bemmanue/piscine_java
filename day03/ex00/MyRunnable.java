public class MyRunnable implements Runnable {
    private final int       count;
    private final String    msg;

    public MyRunnable(int count, String msg) {
        this.count = count;
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
};