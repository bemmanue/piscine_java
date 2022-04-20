public class UsersArrayList implements UserList {
    private User[]  userArray = new User[10];
    private Integer usersNumber = 0;

    public void addUser(User newUser) {
        if (usersNumber == userArray.length) {
            int newSize = userArray.length + (userArray.length / 2);
            User[] tempArray = new User[userArray.length];
            int tempSize = userArray.length;

            for (int i = 0; i < usersNumber; i++) {
                tempArray[i] = userArray[i];
            }

            userArray = new User[newSize];
            for (int j = 0; j < tempSize; j++) {
                userArray[j] = tempArray[j];
            }
        }
        userArray[usersNumber] = newUser;
        usersNumber++;
    }

    public User getUserById(Integer id) {
        for (int i = 0; i < usersNumber; i++) {
            if (userArray[i].getIdentifier().equals(id))
                return userArray[i];
        }
        throw new UserNotFoundException("User ");
    }

    public User getUserByIndex(Integer index) {
        if (index < 0 || index > usersNumber)
            return userArray[index];
        throw new UserNotFoundException("");
    }

    public Integer getUsersNumber() {
        return usersNumber;
    }

    public void printUsers() {
        for (int i = 0; i < usersNumber; i++) {
            userArray[i].printInfo();
            System.out.println("--------------------------------");
        }
    }
}
