package streams;

import java.util.Arrays;
import java.util.List;

public class B_Map {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");

    cities.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }

}
