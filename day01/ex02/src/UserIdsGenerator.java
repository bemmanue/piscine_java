public class UserIdsGenerator {
    private static Integer   lastId;

    private static UserIdsGenerator instance;
    private UserIdsGenerator() {
        lastId = 0;
    }
    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }
    public Integer generateId() {
        lastId += 1;
        return lastId;
    }
}
