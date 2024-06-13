import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
//        Optional<String> optionalValue = Optional.ofNullable(null);
//        System.out.println(optionalValue.isEmpty());

//        Optional<String> optionalValue = Optional.ofNullable("Hello");
//        String result = optionalValue.orElse("Default");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseGet(() -> "Value from Suplier");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
//        System.out.println(result);

          Optional<String> optionalValue = Optional.of("Hello");
          optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));


    }
}
