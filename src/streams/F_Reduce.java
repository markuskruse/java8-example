package streams;

import java.util.Arrays;
import java.util.List;

public class F_Reduce {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn", "paris");

    String concatted = cities.stream()
        .reduce("", (a, b) -> a + ":" + b);
    System.out.println(concatted);

  }

}
