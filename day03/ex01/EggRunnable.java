public class EggRunnable implements Runnable {
    private final CommonResource    resource;

    public EggRunnable(CommonResource resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < resource.count; i++) {
            resource.printEgg();
        }
    }
}
