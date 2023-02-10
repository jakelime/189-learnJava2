import java.security.cert.X509CRL;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        System.out.println("\n**************************************");
        names.stream()
            .map(x -> "Hello! " + x)
            .forEach(x -> System.out.println(x));


        System.out.println("\n**************************************");

        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");

        String targetUsername = "neon_ninja";
        String username =  usernames.stream()
            .filter(x -> x.equals(targetUsername))
            .findFirst()
            .orElse("usernameNotFound");
        System.out.println("Found you: " + username);

        System.out.println("\n**************************************");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        long numEven = numbers.stream()
            .filter(x -> x % 2 == 0)
            .count();

        System.out.println("There are " + numEven + " even numbers in this list");

    }

}


