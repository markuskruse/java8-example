package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_Collect {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");

    cities = cities.stream()
        .map(String::toLowerCase)
        .filter(city -> !city.startsWith("t"))
        .collect(Collectors.toList());

    System.out.println("cities = " + cities);
  }

}
