import java.util.UUID;

public interface UserList {
    void addUser(User newUser);
    User getUserById(Integer id);
    User getUserByIndex(Integer index);
    Integer getUsersNumber();
    void printUsers();
}
