package streams;

import java.util.Arrays;
import java.util.List;

public class A_foreach {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");

    cities.stream().forEach(System.out::println);

  }

}
