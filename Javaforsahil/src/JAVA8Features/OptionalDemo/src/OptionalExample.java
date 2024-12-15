package JAVA8Features.OptionalDemo.src;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Name is not present.");
        }

        String defaultName = name.orElse("Unknown");
        System.out.println("Default name: " + defaultName);
    }
}