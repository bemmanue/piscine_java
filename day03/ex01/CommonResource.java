public class CommonResource {
    int     count = 5;
    boolean isEggPrinted = false;

    public CommonResource(int count) {
        this.count = count;
    }

    public synchronized void printHen() {
        while (!isEggPrinted) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hen");
        isEggPrinted = false;
        notify();
    }

    public synchronized void printEgg() {
        while (isEggPrinted) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Egg");
        isEggPrinted = true;
        notify();
    }
}
