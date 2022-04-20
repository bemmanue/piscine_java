public class User {
    final private Integer   identifier;
    final private String    name;
    private Integer         balance;

    User(Integer identifier, String name, Integer balance) {
        this.identifier = identifier;
        this.name = name;
        this.balance = balance;
    }
    String getName() {
        return this.name;
    }
    Integer getIdentifier() {
        return this.identifier;
    }
    Integer getBalance() {
        return this.balance;
    }
    void setBalance(Integer balance) {
        this.balance = balance;
    }
    void printInfo() {
        System.out.println("Name:           " + name);
        System.out.println("Balance:        " + balance);
        System.out.println("ID:             " + identifier);
    }
}
