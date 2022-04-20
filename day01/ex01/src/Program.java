public class Program {

    public static void main(String[] args) {
	User client1 = new User("Yulya", 1000000);
	client1.printInfo();
	System.out.println();

	User client2 = new User("Kamil", 50000000);
    client2.printInfo();
    System.out.println();

    User client3 = new User("Kamil", 50000000);
    client3.printInfo();
    System.out.println();
    }
}
