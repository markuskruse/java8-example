package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E_Distinct {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn", "paris");

    cities.stream()
        .map(String::toLowerCase)
        .distinct()
        .forEach(System.out::println);

  }

}
