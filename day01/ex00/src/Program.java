public class Program {

    public static void main(String[] args) {
	User client1 = new User(1, "Yulya", 1000000);
	client1.printInfo();
	System.out.println();

	User client2 = new User(2, "Kamil", 50000000);
    client2.printInfo();
    System.out.println();

    Transaction transaction = new Transaction
        (client1, client2, -50000000);
    transaction.printInfo();
    System.out.println();

    client1.printInfo();
    System.out.println();

    client2.printInfo();
    System.out.println();
    }
}
