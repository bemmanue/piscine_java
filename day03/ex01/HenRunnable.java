public class HenRunnable implements Runnable {
    private final CommonResource    resource;

    public HenRunnable(CommonResource resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < resource.count; i++) {
            resource.printHen();
        }
    }
}
