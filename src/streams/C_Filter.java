package streams;

import java.util.Arrays;
import java.util.List;

public class C_Filter {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");

    cities.stream()
        .filter(city -> city.toLowerCase().startsWith("t"))
        .forEach(System.out::println);
  }

}
