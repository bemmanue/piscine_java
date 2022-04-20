public class Program {

    public static void main(String[] args) {
        UserList userList = new UsersArrayList();

        User client1 = new User("Yulya", 1000000);
        User client2 = new User("Kamil", 250);
        User client3 = new User("Dayana", 25645);
        User client4 = new User("Misha", 5);
        User client5 = new User("Karina", 4576);
        User client6 = new User("Ruslan", 6879);
        User client7 = new User("Martin", 60);
        User client8 = new User("Vova", 54756);
        User client9 = new User("Kamilla", 7);
        User client10 = new User("Iskander", 3);
        User client11 = new User("Yulya Brazhaeva", 57567);
        User client12 = new User("Maksim", 65764876);

        userList.addUser(client1);
        userList.addUser(client2);
        userList.addUser(client3);
        userList.addUser(client4);
        userList.addUser(client5);
        userList.addUser(client6);
        userList.addUser(client7);
        userList.addUser(client8);
        userList.addUser(client9);
        userList.addUser(client10);
        userList.addUser(client11);
//        userList.addUser(client12);

        userList.printUsers();
    }
}