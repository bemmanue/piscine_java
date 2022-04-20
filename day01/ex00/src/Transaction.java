import java.util.UUID;

public class Transaction {
    final private UUID              identifier;
    final private User              recipient;
    final private User              sender;
    final private TransferCategory  transCat;
    final private Integer           amount;

    Transaction(User client1, User client2, TransferCategory transCat, Integer amount) {
        if (amount < 0) {
            this.recipient = client1;
            this.sender = client2;
            this.amount = -amount;
        } else {
            this.recipient = client2;
            this.sender = client1;
            this.amount = amount;
        }
        this.recipient.setBalance(this.recipient.getBalance() + this.amount);
        this.sender.setBalance(this.sender.getBalance() - this.amount);
        this.transCat = transCat;
        identifier = UUID.randomUUID();
    }
    public void printInfo() {
        System.out.println("Recipient:      " + recipient.getName());
        System.out.println("Sender:         " + sender.getName());
        System.out.println("Amount:         " + amount);
        System.out.println("Category:       " + transCat);
        System.out.println("Transaction ID: " + identifier);
    }
}

enum TransferCategory {
    DEBITS,
    CREDITS
}
