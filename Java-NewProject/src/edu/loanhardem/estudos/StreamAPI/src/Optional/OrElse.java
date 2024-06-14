package Optional;

import java.util.Optional;

public class OrElse {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default"); 
        System.out.println(result);

        result = "Loan";
        System.out.println(result);
    }
}