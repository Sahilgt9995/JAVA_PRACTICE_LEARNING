package JAVA8Features.Collectors.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<String> names= Arrays.asList("Sahil", "mahip","samay","Joshua");
        List<String> collectedNames = names.stream()
                .filter(name -> name.toUpperCase().startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("Filtered Names: " + collectedNames);

    }
}
