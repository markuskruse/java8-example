package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C_UsingALambdaWithoutBlock {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");

    //using it
    cities = cities.stream()
        .map(city -> city.toUpperCase())
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);
  }
}
