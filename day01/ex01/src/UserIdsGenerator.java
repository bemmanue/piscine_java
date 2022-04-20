public class UserIdsGenerator {
    private static Integer   lastId;

    private static UserIdsGenerator instance;
    private UserIdsGenerator() {

    }
    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }
}
