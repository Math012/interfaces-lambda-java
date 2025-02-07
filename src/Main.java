import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Matheus", 26)
                , new User("Ana", 28)
                , new User("Julia", 30)
                , new User("Marcos", 34)
        );

        printStringValue(user -> String.valueOf(user.getIdade()), users);
        System.out.println("======================================");
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}