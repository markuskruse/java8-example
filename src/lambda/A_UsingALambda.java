package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A_UsingALambda {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");

    //declaring the lambda
    Function<String, String> toUpperCaseFunction = city -> {
      return city.substring(0, 3);
    };

    //using it
    cities = cities.stream()
        .map(toUpperCaseFunction)
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);
  }
}
