package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B_UsingALambdaInline {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");

    cities = cities.stream()
        .map(                                  city -> { return city.toUpperCase();                })
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);
  }
}
