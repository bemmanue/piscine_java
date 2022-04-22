public class Program {

    public static void main(String[] args) {

        int count = 0;

        if (args.length != 1 || !args[0].startsWith("--count=")) {
            System.out.println("Wrong argument");
            System.exit(-1);
        } else {
            try {
                count = Integer.parseInt(args[0].substring(8));
            }
            catch (Exception e) {
                System.out.println("Wrong argument");
                System.exit(-1);
            }
        }

        CommonResource resource = new CommonResource(0);

        Runnable hen_task = new MyRunnable(count, "Hen", resource);
        Runnable egg_task = new MyRunnable(count, "Egg", resource);

        Thread egg = new Thread(egg_task);
        Thread hen = new Thread(hen_task);

        egg.start();
        hen.start();

        try {
            egg.join();
            hen.join();
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
